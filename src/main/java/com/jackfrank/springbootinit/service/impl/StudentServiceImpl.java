package com.jackfrank.springbootinit.service.impl;


import com.jackfrank.springbootinit.mapper.StudentMapper;
import com.jackfrank.springbootinit.pojo.Student;
import com.jackfrank.springbootinit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/28 0:11
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void saveStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Student queryByStudentId(String id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public List<Student> queryByCondition(String sex) {
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("sex",sex);
        List<Student> list = studentMapper.selectByExample(example);
        return list;
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

}
