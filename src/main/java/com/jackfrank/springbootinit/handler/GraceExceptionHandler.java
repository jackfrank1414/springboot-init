package com.jackfrank.springbootinit.handler;

import com.jackfrank.springbootinit.exception.MyException;
import com.jackfrank.springbootinit.vo.JsonResult;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 统一异常拦截处理,针对异常自定义去捕获，并返回指定类型数据（json数据）到前端
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 0:24
 */
@ControllerAdvice
public class GraceExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    @ResponseBody
    public JsonResult maxSizeLimit(MaxUploadSizeExceededException e){
        return JsonResult.errorMsg("文件大小不能超过500KB");
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public JsonResult myException(MyException e){
        return JsonResult.errorMsg(e.getMessage());
    }
}
