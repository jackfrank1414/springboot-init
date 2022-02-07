package com.jackfrank.springbootinit.service.impl;

import com.jackfrank.springbootinit.mapper.UserMapper;
import com.jackfrank.springbootinit.pojo.User;
import com.jackfrank.springbootinit.service.UserService;
import com.jackfrank.springbootinit.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/2/7 17:52
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByName(String userName) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",userName);
        User user = userMapper.selectOneByExample(example);
        return user;
    }

    @Override
    public JsonResult userLogin(String uname, String upwd) {
        if(StringUtils.isEmpty(uname) || StringUtils.isEmpty(upwd)){
            return JsonResult.errorMsg("用户名或密码不能为空");
        }
        User user = queryByName(uname);

        if(user == null){
            return JsonResult.errorMsg("用户名不存在");
        }

        if(!upwd.equals(user.getUserpwd())){
            return JsonResult.errorMsg("用户密码不正确");
        }

        return JsonResult.ok();
    }

    @Override
    public JsonResult userRegister(String uname, String upwd, String upwdAg) {
        if(StringUtils.isEmpty(uname) || StringUtils.isEmpty(upwd) || StringUtils.isEmpty(upwdAg)){
            return JsonResult.errorMsg("用户名或密码不能为空");
        }
        if(!upwd.equals(upwdAg)){
            return JsonResult.errorMsg("两次输入的密码不同");
        }

        User user = queryByName(uname);
        if(user != null){
            return JsonResult.errorMsg("该用户名已存在");
        }

        User newUser = new User(uname,upwd);
        userMapper.insert(newUser);

        return JsonResult.ok(newUser);

    }
}
