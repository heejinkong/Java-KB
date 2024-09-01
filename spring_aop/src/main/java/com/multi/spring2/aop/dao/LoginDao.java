package com.multi.spring2.aop.dao;


import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
    public int login(){
        return 1;
    }
}
