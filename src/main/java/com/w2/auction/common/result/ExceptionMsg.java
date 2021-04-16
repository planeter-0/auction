
package com.w2.auction.common.result;
//异常信息的枚举类
public enum ExceptionMsg {
	SUCCESS("200", "操作成功"),
	FAILED("999999","操作失败"),
    UserNameUsed("000100","该用户名已被使用"),
    AUTHENTICATION_FAILED("000400","认证失败，请重定向至登陆页面"),
    LimitSize("000310","超出网盘容量限制"),
    UNPASSED("000300","未审核或审核未通过"),
    FileEmpty("000400","上传文件为空"),
    ;
   private ExceptionMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    private String code;
    private String msg;
    
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}

    
}

