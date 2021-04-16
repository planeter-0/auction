package com.w2.auction.controller;

import com.w2.auction.common.exception.UploadException;
import com.w2.auction.common.result.ExceptionMsg;
import com.w2.auction.common.result.Response;
import com.w2.auction.common.result.ResponseData;
import com.w2.auction.common.utils.QiniuUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Objects;

/**
 * @author Exrickx
 */
@RestController
public class ImageController {

    @RequestMapping(value = "/image/imageUpload", method = RequestMethod.POST)
    public Response uploadFile(@RequestParam("file") MultipartFile uploadFile,
                               HttpServletRequest request) {

        String imageURL = null;
        // 转存文件
        try {
            //上传至业务服务器
            String filepath = request.getSession().getServletContext().getRealPath("/upload");
            String filename = QiniuUtil.renamePic(Objects.requireNonNull(uploadFile.getOriginalFilename()));//UUID
            File file = new File(filepath, filename);
            FileUtils.copyInputStreamToFile(uploadFile.getInputStream(), file);
            //上传至七牛云服务器
            imageURL = QiniuUtil.upload(filepath, filename);
            if (imageURL.contains("error")) {
                throw new UploadException("上传失败");
            }
            // 删除业务服务器文件
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseData(ExceptionMsg.SUCCESS, imageURL);
    }
}
