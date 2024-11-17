package org.zerock.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MemberController {
	
	@GetMapping("/member/login")
	public void login() {
		log.info("로그인 진입");
	}
	
	@GetMapping("/member/join")
	public void join() {
		log.info("회원가입 진입");
	}

	

}
