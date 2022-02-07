package com.jackfrank.springbootinit.exception;

/**
 * 抛出自定义异常
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 21:48
 */
public class GraceException {

    public static void throwMyException(String errorMsg){
        throw new MyException(errorMsg);
    }
}
