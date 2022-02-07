package com.jackfrank.springbootinit.exception;

/**
 * 自定义异常
 * 目的：
 *      方便解耦，可以在拦截器、控制器以及业务层使用
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 21:40
 */
public class MyException extends RuntimeException{

    public MyException(String errorMsg){
        super(errorMsg);
    }
}
