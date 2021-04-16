package com.w2.auction.repositoey;

import com.w2.auction.pojo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
}
