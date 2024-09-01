package com.multi.spring2.aop.dao;

import com.multi.spring2.aop.domain.BoardVO;
import com.multi.spring2.aop.domain.MemberVO;
import com.multi.spring2.aop.mapper.AOPMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class AOPDAO {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public AOPDAO(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public int insertMember(MemberVO memberVO) {
        int rows = sqlSessionTemplate.getMapper(AOPMapper.class).insertMember(memberVO);
        return rows;
    }

    public int insertBoard(BoardVO boardVO) {
        int rows = sqlSessionTemplate.getMapper(AOPMapper.class).insertBoard(boardVO);
        return rows;
    }
}

