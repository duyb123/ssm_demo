package com.dyb.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dyb.pojo.User;

/**
 * Dao接口
 * @author 周谦
 * @date 2017年9月25日
 */
@Repository("userMapper")
public interface UserMapper {
	/** 按照主键查找 */
	User  selectById(int id);
	/** 按照用户名和密码查找 */
	User  selectByNameAndPwd(@Param("loginName")String  loginName,@Param("password")String password);
	/** 查找所有 */
	List<User>  selectAll();
	
	/** 组合查询 */
	List<User>  search(User user);
	/*
	*//**批量插入*//*
    void insertUsers(@Param(value = "list") List<User> users);
	*//**批量更新*//*
    void updateUsers(@Param(value = "list") List<User> users);
	*/
	/** 按照用户查找 */
	List<User>  selectByName(String name);
	/** 插入 */
	int  insertUser(User user);
	/** 更新 */
	int  updateUser(User user);
	/** 删除 */
	int  delById(int id);
	
	
}
