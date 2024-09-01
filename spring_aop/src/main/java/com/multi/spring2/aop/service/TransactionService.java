package com.multi.spring2.aop.service;

import com.multi.spring2.aop.dao.AOPDAO;
import com.multi.spring2.aop.domain.BoardVO;
import com.multi.spring2.aop.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@Slf4j
public class TransactionService implements TransactionInterface {

    AOPDAO aopDAO;

    @Autowired
    public TransactionService(AOPDAO aopDAO) {
        this.aopDAO = aopDAO;
    }

    @Override
    // SQLException 발생 시에도 롤백 처리
    @Transactional(rollbackFor = {RuntimeException.class, SQLException.class})
    public void tran(BoardVO boardVO, MemberVO memberVO) throws SQLException, RuntimeException {
        try {
            int memberResult = aopDAO.insertMember(memberVO);
        } catch(Exception e){
            log.debug("트랜잭션 롤백 테스트: Exception 발생");
            throw new SQLException("트랜잭션 롤백 테스트: Exception 발생");
        }

        try {
            int boardResult = aopDAO.insertBoard(boardVO);
        } catch(Exception e){
            log.debug("트랜잭션 롤백 테스트: Exception 발생");
            throw new SQLException("트랜잭션 롤백 테스트: Exception 발생");
        }
    }
}
