package com.jackfrank.springbootinit.mapper;

import com.jackfrank.springbootinit.my.mapper.MyMapper;
import com.jackfrank.springbootinit.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends MyMapper<User> {
}