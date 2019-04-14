package com.dyb.service;

import java.util.List;

import com.dyb.pojo.User;

/**
 * 业务接口
 * @author 周谦
 * @date 2017年9月27日
 */
public interface UserService {
	
	/** 登录 */
	User login(String name, String pwd);
	
	/** 注册 */
	boolean register(User user);
	
	/** 模糊查询 */
	List<User> search(String name);
	
	/** 查询所有 */
	List<User> search();

}
