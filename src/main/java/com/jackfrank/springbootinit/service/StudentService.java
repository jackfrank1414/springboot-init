package com.jackfrank.springbootinit.service;

import com.jackfrank.springbootinit.pojo.Student;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/31 20:25
 */
public interface StudentService {

    void saveStudent(Student student);

    void deleteStudent(String id);

    Student queryByStudentId(String id);

    List<Student> queryByCondition(String sex);

    void updateStudent(Student student);

}
