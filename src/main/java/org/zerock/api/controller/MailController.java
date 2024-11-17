package org.zerock.api.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.api.domain.MailDTO;
import org.zerock.api.service.MailService;

import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
public class MailController {
	
	private final MailService mailService;
	private String authCode;
	
	@PostMapping("/emailCheck")
	public String emailCheck(MailDTO dto) throws MessagingException, UnsupportedEncodingException {
		authCode = mailService.sendSimpleMesage(dto.getEmail());
		
		log.info(authCode);
		
		return authCode;
	}
	
	
	@PostMapping("/certification")
	public String postMethodName(String certification) {
		
		return certification;
	}
	
}
