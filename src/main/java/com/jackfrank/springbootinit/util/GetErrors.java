package com.jackfrank.springbootinit.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/2/1 16:35
 */

public class GetErrors {
    public static Map<String,String> getErrors(BindingResult result){
        Map<String,String> errorMap = new HashMap<>();
        List<FieldError> fieldErrorList = result.getFieldErrors();

        for(FieldError fieldError: fieldErrorList){
            String file = fieldError.getField();
            String msg = fieldError.getDefaultMessage();
            errorMap.put(file,msg);
        }

        return errorMap;
    }
}
