package com.olivecrypto.MSProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olivecrypto.MSProject.clint.IProducerService;

@RestController
@RequestMapping("/test")
public class SercheController {
	@Autowired
	IProducerService sevices;
	
	@GetMapping("/display")
	public String displayMessage() {
		return sevices.getMessage();
	}
}
