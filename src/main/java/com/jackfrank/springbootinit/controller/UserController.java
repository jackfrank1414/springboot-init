package com.jackfrank.springbootinit.controller;

import com.jackfrank.springbootinit.pojo.User;
import com.jackfrank.springbootinit.service.UserService;
import com.jackfrank.springbootinit.service.impl.UserServiceImpl;
import com.jackfrank.springbootinit.vo.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.JavaScriptBaseMessage;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/2/7 18:26
 */
@RestController
@RequestMapping("user")
@Api(value = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户",notes = "根据用户名查询用户")
    @ApiImplicitParam(name = "username",value = "用户名")
    @RequestMapping("queryByName")
    public JsonResult queryByName(String username){
        User user = new User();
        user = userService.queryByName(username);
        return JsonResult.ok(user);
    }

    @ApiOperation(value = "用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户登录名"),
            @ApiImplicitParam(name = "userpwd",value = "用户登录密码")
    })
    @RequestMapping("login")
    public JsonResult login(String username, String userpwd){
        return userService.userLogin(username,userpwd);
    }

    @ApiOperation(value = "用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uname",value = "用户名"),
            @ApiImplicitParam(name = "upwd",value = "用户密码"),
            @ApiImplicitParam(name = "upwdAg",value = "再次输入密码")
    })
    @RequestMapping("register")
    public JsonResult register(String uname, String upwd, String upwdAg){
        return userService.userRegister(uname,upwd,upwdAg);
    }
}
