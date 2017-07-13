package com.phu.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.phu.dao.User;

@Component
public class UserService {

	@Reference(version="1.0.0")
	private UserServiceI userService;
	
	
	public String InsertUser(User user){
		userService.Insert(user);
		return "success";
	}
	
}
