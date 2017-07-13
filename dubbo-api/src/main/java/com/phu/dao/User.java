package com.phu.dao;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{

	private static final long serialVersionUID = -7556856067228609292L;
	private String userId;
	private String name;
	private int age;
	private int sex;
	private String addres;
	private String work;
}
