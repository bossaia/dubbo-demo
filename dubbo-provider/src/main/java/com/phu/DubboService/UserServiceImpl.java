package com.phu.DubboService;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.phu.dao.User;
import com.phu.persistence.UserMapper;
import com.phu.service.UserServiceI;

@Service(version="1.0.0")
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void Insert(User user) {
		//// TODO Auto-generated method stub
		userMapper.Insert(user);

	}

}
