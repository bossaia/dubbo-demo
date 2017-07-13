package com.phu.DubboService;

import com.alibaba.dubbo.config.annotation.Service;
import com.phu.service.ExampleService;

@Service(version = "1.0.0")
public class ExampleServiceImpl implements ExampleService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6591900875272367270L;
	

	@Override
	public String SayHi(String name) {
		// TODO Auto-generated method stub
		return "hi,provider:"+name;
	}
	
}