package com.jackfrank.springbootinit.controller;

import com.jackfrank.springbootinit.pojo.TestStudent;
import com.jackfrank.springbootinit.vo.JsonResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/27 21:58
 */
@RestController
@RequestMapping("test")
@Api(value = "测试接口")
public class TestController {

    @Autowired
    private TestStudent testStudent;
    @RequestMapping("getTestStudent")
    public Object getTestStudent(){
        return testStudent;
    }

    @Value("${self.stu1.name}")
    private String name;
    @Value("${self.stu1.gender}")
    private String gender;
    @RequestMapping("getStu1")
    public Object getStu1(){
        return name + gender;
    }

    @Value("${self.stu2.gender}")
    private String gender2;
    @Value("${self.stu2.age}")
    private Integer age;
    @RequestMapping("getStu2")
    public Object getStu2(){
        return gender2 + age;
    }

    @RequestMapping("getJsonData")
    public JsonResult getJsonData(){
        return JsonResult.ok(testStudent);
    }
}
