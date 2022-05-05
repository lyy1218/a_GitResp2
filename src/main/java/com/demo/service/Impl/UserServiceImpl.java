package com.demo.service.Impl;

import com.demo.dao.UserDao;
import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:lyy
 * @Date:2022/4/25 - 04 - 25 - 15:45
 * @Desctiption:com.demo.service.Impl
 * @Version:1.0
 */

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    //登录
    public User testLogin(String name, String password) {
        return userDao.testLogin(name, password);
    }

    //注册
    public int testRegist(String name, String password) {
        userDao.testRegist(name, password);
        return 0;
    }

    //查询
    public List<User> testFindAll() {
        return userDao.testFindAll();
    }
}
