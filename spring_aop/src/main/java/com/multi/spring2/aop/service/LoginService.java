package com.multi.spring2.aop.service;


import com.multi.spring2.aop.dao.LoginDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Transactional
@RequiredArgsConstructor
public class LoginServi e {

    private final LoginDao loginDao;

    //login 기능 수행 서비스
    public int login(int token){
        System.out.println("로그인 기능 수행 서비스");
        if(token != 1){
            System.out.println("로그인 세션 인증 실패");
            return 0;
        }
        return loginDao.login();
    }
// Compare this snippet from src/main/java/com/multi/spring2/aop/service/TransactionInterface.java
}

