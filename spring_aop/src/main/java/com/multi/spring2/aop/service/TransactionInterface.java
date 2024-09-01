package com.multi.spring2.aop.service;

import com.multi.spring2.aop.domain.BoardVO;
import com.multi.spring2.aop.domain.MemberVO;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

public interface TransactionInterface {

    public void tran(BoardVO boardVO, MemberVO memberVO)
            throws SQLException;
}

