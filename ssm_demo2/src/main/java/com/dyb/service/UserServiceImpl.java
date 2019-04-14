package com.dyb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyb.mapper.UserMapper;
import com.dyb.pojo.User;

/**
 * 业务接口实现
 * @author 周谦
 * @date 2017年9月27日
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper  userMapper;
	

	@Override
	public User login(String name, String pwd) {
		return userMapper.selectByNameAndPwd(name, pwd);
	}

	@Override
	public boolean register(User user) {
		return userMapper.insertUser(user)>0;
	}

	@Override
	public List<User> search(String name) {
		return userMapper.selectByName(name);
	}

	@Override
	public List<User> search() {
		return userMapper.selectAll();
	}

}
