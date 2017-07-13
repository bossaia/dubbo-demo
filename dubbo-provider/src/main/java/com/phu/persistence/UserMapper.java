package com.phu.persistence;

import org.apache.ibatis.annotations.Mapper;

import com.phu.dao.User;
@Mapper
public interface UserMapper {

	void Insert(User user);
}
