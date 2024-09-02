package org.scoula.controller;

import lombok.extern.log4j.Log4j;
import org.scoula.security.account.domain.CustomUser;
import org.scoula.security.account.domain.MemberVO;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Log4j
@RequestMapping("/security")
@Controller
public class SecurityController {

    @GetMapping("/all")
    public void doAll() {
        log.info("do all can access everybody");
    }

    @GetMapping("/member")
    public void doMember() {
    }


    @GetMapping("/admin")
    public void doAdmin() {
    }

    @GetMapping("/login")
    public void login() {
        log.info("login page");
        //view를 지정하지 않으면 요청했던 주소 그대로 문자열 정보로 views/login.jsp로 렌더링
    }

    @GetMapping("/logout")
    public void logout() {
        log.info("logout page");
    }

}
