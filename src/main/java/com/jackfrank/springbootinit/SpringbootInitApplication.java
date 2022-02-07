package com.jackfrank.springbootinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author asus
 */
@SpringBootApplication()
@MapperScan(basePackages = "com.jackfrank.springbootinit.mapper")
public class SpringbootInitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitApplication.class, args);
    }

}
