package com.olivecrypto.MSProject.clint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Produce-Message")
public interface IProducerService {
	
	
    @GetMapping("/serch/display")
	public String getMessage();
}
