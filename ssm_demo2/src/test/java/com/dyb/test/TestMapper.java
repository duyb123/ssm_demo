package com.dyb.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dyb.mapper.UserMapper;
import com.dyb.pojo.User;
import com.dyb.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-*.xml")
public class TestMapper {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserService service;
	@Test
	public void test1() {
		System.out.println("测试Test1");
		//User user = userMapper.selectById(1);
		User user =service.login("张三", "123");
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		System.out.println("测试Test2");
		User user = userMapper.selectByNameAndPwd("张三", "123");
		System.out.println(user);
	}

}
