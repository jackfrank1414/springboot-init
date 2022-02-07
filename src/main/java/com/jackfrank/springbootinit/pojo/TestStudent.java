package com.jackfrank.springbootinit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/27 21:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@ConfigurationProperties(prefix = "student")
@PropertySource(value = "classpath:MyConfig.properties",encoding = "utf-8")
public class TestStudent {
    private String name;
    private String gender;
    private Integer age;
}
