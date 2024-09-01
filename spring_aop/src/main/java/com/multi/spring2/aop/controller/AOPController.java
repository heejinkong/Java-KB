package com.multi.spring2.aop.controller;

import com.multi.spring2.aop.domain.BoardVO;
import com.multi.spring2.aop.domain.MemberVO;
import com.multi.spring2.aop.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequiredArgsConstructor
@Slf4j
public class AOPController {

    private final ASiteInterface aSiteService;
    private final TransactionInterface aopService;
    private final LoginService loginService;

    @RequestMapping("/login")
    public void login(){
        int loginSuccess = loginService.login(1);
        if(loginSuccess == 1){
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }

        System.out.println("로그인 기능 수행 컨트롤러");
    }
    @RequestMapping("a.do")
    public void aop1() {
        aSiteService.tour();
    }

    @RequestMapping("a2.do")
    public void aop2() {
        aSiteService.order();
    }

    @RequestMapping("a3.do")
    public void aop3() {
        //각각의 작업 시간 & 평균 시간 출력
        aSiteService.anotherTask();
        aSiteService.performTask();
        aSiteService.anotherTask();
        aSiteService.performTask();
    }

    @RequestMapping("transaction.do")
    public String transaction(BoardVO bbsVO2,
                              MemberVO memberVO,
                              Model model) {
        try {
            aopService.tran(bbsVO2, memberVO);
            model.addAttribute("result", "모든 db처리 성공!! commit중");
        } catch (SQLException e) {
            model.addAttribute("result", "db처리 에러발생!!! rollback중");
            e.printStackTrace();
        } catch (Exception e) {

        }

        return "/aop/aop_result";
    }

}
