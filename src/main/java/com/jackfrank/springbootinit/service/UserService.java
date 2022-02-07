package com.jackfrank.springbootinit.service;

import com.jackfrank.springbootinit.pojo.User;
import com.jackfrank.springbootinit.vo.JsonResult;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/2/7 17:51
 */
public interface UserService {

    User queryByName(String userName);

    JsonResult userLogin(String uname, String upwd);
    JsonResult userRegister(String uname, String upwd, String upwdAg);
}
