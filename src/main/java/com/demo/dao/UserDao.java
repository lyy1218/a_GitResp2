package com.demo.dao;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListIterator;

/**
 * @Auther:lyy
 * @Date:2022/4/25 - 04 - 25 - 15:38
 * @Desctiption:com.demo.dao
 * @Version:1.0
 */

@Repository
public interface UserDao {
//    登录功能
    public User testLogin(@Param("name") String name,@Param("password") String password);

//    注册功能
    public void testRegist(@Param("name") String name,@Param("password") String password);

//    查询
    @Select("select * from user")
    public List<User> testFindAll();
}
