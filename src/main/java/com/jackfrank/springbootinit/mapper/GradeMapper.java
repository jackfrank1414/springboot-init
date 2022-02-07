package com.jackfrank.springbootinit.mapper;

import com.jackfrank.springbootinit.my.mapper.MyMapper;
import com.jackfrank.springbootinit.pojo.Grade;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeMapper extends MyMapper<Grade> {
}