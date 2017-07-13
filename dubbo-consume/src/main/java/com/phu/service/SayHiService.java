package com.phu.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class SayHiService {
	
	@Reference(version="1.0.0")
	ExampleService pSayHiService;
	
	public String sayHi(){
		
		if(pSayHiService==null){
			System.out.println("PSayHiService为空");
			return "null";
		}
		return pSayHiService.SayHi("consumer");
	}
}
