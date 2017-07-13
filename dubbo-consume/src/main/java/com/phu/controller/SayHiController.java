package com.phu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phu.service.SayHiService;

@Controller
@RequestMapping(value="/")
public class SayHiController {

	
	@Autowired
	private SayHiService sayHiService;
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	@ResponseBody
	public String SayHi(){
		if(sayHiService==null){
			System.out.println("未初始化Bean");
			return "NULL";
		}
		
		return sayHiService.sayHi();
	}
	
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public  String SayTest(){
		return "test";
	}
}
