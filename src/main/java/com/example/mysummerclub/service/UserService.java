package com.example.mysummerclub.service;

import com.example.mysummerclub.pojo.User;

import java.util.List;

/**
 *
 */
public interface UserService {
    //添加用户
    void insertUser(User user);

    //通过ID删除用户
    void deleteUserById(Long id);

    //通过主键更新user，更新值不为null的字段
    void updateUserById(User user);

    //通过主键查询user信息
    User findUserById(Long id);

    //通过username发现user是否被注册
    List<User> findUserByUsername(String username);
    //登录
    List<User> findUserByUsernameAndPassword(String username,String password);
    //显示所有user
    List<User> findAllUser();
}
