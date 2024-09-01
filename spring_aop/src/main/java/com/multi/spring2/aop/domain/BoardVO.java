package com.multi.spring2.aop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
        private int no;         // 게시글의 고유 ID
        private String title;   // 게시글 제목
        private String content; // 게시글 내용
        private String writer;     // 게시글 작성자 (member 테이블의 id를 참조)
}


/*
CREATE TABLE board (
    no INT PRIMARY KEY AUTO_INCREMENT,  -- 게시글의 고유 ID, 자동 증가
    title VARCHAR(255),        -- 게시글 제목
    content varchar(255),              -- 게시글 내용
    writer varchar(255),                         -- 게시글 작성자 (member 테이블의 id를 참조)
    FOREIGN KEY (writer) REFERENCES member(id)  -- 외래 키 설정
);
 */