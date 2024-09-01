package com.multi.spring2.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.annotation.*;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) // AOP 프록시 활성화
public class AOPConfig {

    public AOPConfig(){
        System.out.println("AppConfig created");
    }

//    @Bean
//    public AOPConfig.AspectClass aspect() {
//        return new AOPConfig.AspectClass();
//    }

    @Aspect
    @Component
    public class AspectClass {

        @Pointcut("execution(* com.multi.spring2.aop.controller.AOPController.aop1(..))")
        public void tour() {
            // Pointcut method, no implementation needed
        }

        @Before("tour()")
        public void Login() {
            System.out.println("Login aspect triggered");
        }

        @After("tour()")
        public void Logout() {
            System.out.println("Logout aspect triggered");
        }
    }
}


