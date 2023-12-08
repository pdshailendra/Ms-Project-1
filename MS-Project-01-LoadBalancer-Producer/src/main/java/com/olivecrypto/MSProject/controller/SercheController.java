package com.olivecrypto.MSProject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serch")
public class SercheController {
	@Value("${server.port}")
	int port;
	@Value("${spring.application.name}")
	String names;
	@GetMapping("/display")
	public String displayMessage() {
		return " : "+port+"  WELCOME to MS PROject Producer Name : "+names;
	}
}
