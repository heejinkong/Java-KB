package org.scoula.security.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
@EnableWebSecurity
@Log4j
@ComponentScan(basePackages  = {"org.scoula.security"})
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 문자셋 필터
    public CharacterEncodingFilter encodingFilter() {
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        return encodingFilter;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(encodingFilter(), CsrfFilter.class);

        // 경로별 접근 권한 설정
        http.authorizeRequests()
                //모두 허용
            .antMatchers("/security/all").permitAll()
                //특정 역할에게만 허용
            .antMatchers("/security/admin").access("hasRole('ROLE_ADMIN')")
            .antMatchers("/security/member").access("hasRole('ROLE_MEMBER')");

        //0. 실습
//         http.formLogin();
        // 실습은 tomcat시작 후, 바로 주소에 8080/security/admin호출하면
        // 로그인 정보를 얻기 위해 자동생성된 로그인 페이지로 자동 forward!

        //1. 실습
        //실습은 tomcat시작 후, 바로 주소에 8080/security/admin호출하면
        // 로그인 정보를 얻기 위해 다음에서 설정된 커스텀된 로그인 페이지로 자동 forward!/
        http.formLogin() //로그인 설정 시작
            .loginPage("/security/login") // 로그인 페이지 GET URL - security/login 뷰(jsp) 정의
            .loginProcessingUrl("/security/login") // 로그인 POST URL - login form의 action에 지정
            .defaultSuccessUrl("/"); // 로그인 성공 시 이동(redirect)할 페이지

        http.logout()													// 로그아웃 설정 시작
            .logoutUrl("/security/logout")			// POST: 로그아웃 호출 url
            .invalidateHttpSession(true)				// 세션 invalidate
            .deleteCookies("remember-me", "JSESSION-ID")	// 삭제할 쿠키 목록
            .logoutSuccessUrl("/security/logout");		// GET: 로그아웃 이후 이동할 페이지


    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        log.info("configure .........................................");

        auth.inMemoryAuthentication()
                .withUser("admin")
		        .password("{noop}1234")
                //.password("$2a$10$Ou43EADVuLiT1mr4.m3pD.ljgGd3PvbSiMMSrPXRaoaw7nuhAjny")
                .roles("ADMIN", "MEMBER");    // ROLE_ADMIN, ROLE_MEMBER, 로그인한 username(id)를 기반으로 정의

        auth.inMemoryAuthentication()
                .withUser("member")
			    .password("{noop}1234")
                //.password("$2a$10$EsIMfxbJ6NuvwX7MDj4WqOYFzLU9U/lddCyn0nic5dFo3VfJYrXYC")
                .roles("MEMBER");   // ROLE_MEMBER
    }
}
