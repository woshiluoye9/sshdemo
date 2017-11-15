package com.dustin.mybatis.dao;

import com.dustin.mybatis.po.User;

import java.util.List;

/**
 * <p> Description: 使用DAO接口编程， 但是不建议使用，最好是使用mapper代理的方式</p>
 *
 * @author Wangsw
 * @date 2017/11/15下午 06:40
 * @Version 1.0.0
 */
public interface UserDao {
	
	//根据id查询用户信息
	public User queryUserById(int id) throws Exception;
	
	

}
