package com.dustin.DAOTest;

import com.dustin.mybatis.dao.UserDao;
import com.dustin.mybatis.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        //调用userDao的方法
        User user = userDao.queryUserById(1);

        System.out.println(user);

    }

}
