package com.multi.spring2.aop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
        private String id;
        private String pw;
        private String name;
        private String tel;
}

/*
use shop2;
CREATE TABLE member (
    id VARCHAR(255) PRIMARY KEY AUTO_INCREMENT,  -- 회원의 고유 ID, 자동 증가
    pw VARCHAR(255) NOT NULL,           -- 비밀번호
    name VARCHAR(255) NOT NULL,         -- 이름
    tel VARCHAR(20)                     -- 전화번호
);
 */