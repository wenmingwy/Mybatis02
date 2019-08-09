package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    // 1. 实现查询所有用户
    List<User> findAll();
    // 2. 根据用户id查询用户
    User selectByPrimaryKey(Integer id);

    // 3. 添加新用户
    int insert(User record);

    // 4. 根据用户id删除用户
    int deleteByPrimaryKey(Integer id);

    // 5. 根据用户id更新用户
    int updateByPrimaryKey(@Param("user") User user, @Param("userId") int userId);

}