package com.jackfrank.springbootinit.mapper;

import com.jackfrank.springbootinit.my.mapper.MyMapper;
import com.jackfrank.springbootinit.pojo.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper extends MyMapper<Course> {
}