package com.jackfrank.springbootinit.pojo.bo;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/2/1 16:13
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoStudent {

    private String studentno;

    @NotBlank
    private String studentname;

    @NotNull
    private String sex;

    @Min(value = 1,message = "学生年龄最小值为1")
    @Max(value = 22,message = "学生年龄最大值为22")
    private Integer age;

    @Email(message = "邮箱格式不正确")
    private String email;

    @Range(min = 0,max = 100,message = "分数在0-100区间")
    private Integer grade;
}
