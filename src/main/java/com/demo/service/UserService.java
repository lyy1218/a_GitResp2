package com.demo.service;

import com.demo.domain.User;

import java.util.List;

/**
 * @Auther:lyy
 * @Date:2022/4/25 - 04 - 25 - 15:39
 * @Desctiption:com.demo.service
 * @Version:1.0
 */
public interface UserService {
//    登录
    public User testLogin(String name,String password);

//    注册
    public int testRegist(String name, String password);

//    查询
    public List<User> testFindAll();
}
