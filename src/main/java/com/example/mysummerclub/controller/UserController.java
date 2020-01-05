package com.example.mysummerclub.controller;

import com.example.mysummerclub.pojo.User;
import com.example.mysummerclub.service.UserService;
import com.example.mysummerclub.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //添加user
    @ApiOperation("添加user")
    @PostMapping("/insertUser.action")
    public SzpJsonResult insertUser(@RequestBody User user, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        userService.insertUser(user);
        return SzpJsonResult.ok();
    }
    //通过ID删除user
    @ApiOperation("通过ID删除user")
    @DeleteMapping("/deleteUserById.action")
    public SzpJsonResult deleteUserById(@RequestBody Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        userService.deleteUserById(id);
        return SzpJsonResult.ok();
    }
    //通过主键ID更新user，更新值不为null的字段
    @ApiOperation("通过主键ID更新user，更新值不为null的字段")
    @PutMapping("/updateUserById.action")
    public SzpJsonResult updateUserById(@RequestBody User user, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        userService.updateUserById(user);
        return SzpJsonResult.ok();
    }
    //通过ID发现user
    @ApiOperation("通过ID发现user")
    @GetMapping("/findUserById.action")
    public SzpJsonResult findUserById(Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        User userById = userService.findUserById(id);
        return SzpJsonResult.ok(userById);
    }
    //通过username发现user，验证user是否被注册
    @ApiOperation("通过username发现user，验证该用户名是否被注册")
    @GetMapping("/findUserByUsername.action")
    public SzpJsonResult findUserByUsername(String username, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> userByUsername = userService.findUserByUsername(username);
        return SzpJsonResult.ok(userByUsername);
    }
    //登录
    @ApiOperation("登录")
    @GetMapping("/findUserByUsernameAndPassword.action")
    public SzpJsonResult findUserByUsernameAndPassword(String username, String password, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> userByUsernameAndPassword = userService.findUserByUsernameAndPassword(username, password);
        return SzpJsonResult.ok(userByUsernameAndPassword);
    }
    //显示所有user
    @ApiOperation("显示所有的user")
    @GetMapping("/findAllUser.action")
    public SzpJsonResult findAllUser(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> allUser = userService.findAllUser();
        return SzpJsonResult.ok(allUser);
    }
}
