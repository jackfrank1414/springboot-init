package com.jackfrank.springbootinit.controller;

import com.jackfrank.springbootinit.pojo.Student;
import com.jackfrank.springbootinit.pojo.bo.BoStudent;
import com.jackfrank.springbootinit.service.StudentService;
import com.jackfrank.springbootinit.util.GetErrors;
import com.jackfrank.springbootinit.vo.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/31 20:41
 */
@RestController
@RequestMapping("student")
@Api(value = "学生操作接口，用于操作学生的crud")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "添加学生",notes = "该接口提供请求参数，只用作测试")
    @RequestMapping("saveStudent")
    public JsonResult saveStudent(){
        Student student = new Student("0183869","wlj","M");
        studentService.saveStudent(student);
        return JsonResult.ok(student);
    }



    @ApiOperation(value = "添加学生",notes = "请求参数为学生类bostudent，该接口用于测试实体类的属性合法性")
    @PostMapping("addStudent")
    public JsonResult addStudent(@Valid @RequestBody BoStudent boStudent,
                                 BindingResult result){
        if(result.hasErrors()){
            Map<String,String> map = GetErrors.getErrors(result);
            return JsonResult.errorMap(map);
        }

        String studentNo = UUID.randomUUID().toString();
        Student student = new Student();
        log.info(boStudent.toString());

        BeanUtils.copyProperties(boStudent,student);
        student.setStudentno(studentNo);

        log.info(student.getStudentno()+ student.getStudentname()+student.getSex());

        studentService.saveStudent(student);
        return JsonResult.ok(student);

    }

    @ApiOperation(value = "删除学生",notes = "根据主键删除学生")
    @ApiImplicitParam(name = "id",value = "学生学号")
    @RequestMapping(value = "deleteStudent",method = RequestMethod.POST)
    public JsonResult deleteStudent(@RequestParam(value = "id") String studentNo){
        studentService.deleteStudent(studentNo);
        return JsonResult.ok("删除成功！");
    }

    @ApiOperation(value = "查询学生信息",notes = "根据主键查询学生")
    @ApiImplicitParam(name = "studentId",value = "学生学号")
    @RequestMapping("queryByStudentId")
    public JsonResult queryByStudentId(String studentId){
        Student student = studentService.queryByStudentId(studentId);
        return JsonResult.ok(student);
    }

    @ApiOperation(value = "条件查询",notes = "根据性别查询不同学生信息")
    @ApiImplicitParam(name = "sex",value = "学生性别")
    @RequestMapping("queryByCondition")
    public JsonResult queryByCondition(String sex){
        List<Student> list= studentService.queryByCondition(sex);
        return JsonResult.ok(list);
    }

    @ApiOperation(value = "更新学生信息",notes = "该接口微测试类，不接受请求参数")
    @RequestMapping("updateStudent")
    public JsonResult updateStudent(){
        Student newStu = new Student();
        newStu.setStudentno("1800001");
        newStu.setStudentname("wlj");
        newStu.setSex("M");
        studentService.updateStudent(newStu);

        return JsonResult.ok();
    }

}
