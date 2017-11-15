package com.dustin.mybatis.dao;

import com.dustin.mybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public User queryUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("com.dustin.mybatis.mapper.UserMapper.queryUserById", id);
		return user;

	}
	
	


}
