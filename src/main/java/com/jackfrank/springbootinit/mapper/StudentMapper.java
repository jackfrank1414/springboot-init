package com.jackfrank.springbootinit.mapper;

import com.jackfrank.springbootinit.my.mapper.MyMapper;
import com.jackfrank.springbootinit.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends MyMapper<Student> {
}