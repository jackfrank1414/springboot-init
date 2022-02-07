package com.jackfrank.springbootinit.controller.intercepyor;

import com.jackfrank.springbootinit.exception.GraceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 21:09
 */
@Slf4j
public class UserInfoInterceptor implements HandlerInterceptor {

    /**
     * 拦截请求，访问controller之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("userId");
        String userToken = request.getHeader("userToken");

        if(StringUtils.isEmpty(userId) || StringUtils.isEmpty(userToken)){
            log.info("用户信息校验不通过，信息不完全！");
            GraceException.throwMyException("用户信息校验不通过，信息不完全！");
            //return false;
        }

        if(!userId.equalsIgnoreCase("1001") || !userToken.equalsIgnoreCase("woshishibi")){
            log.info("用户权限不通过！");
            GraceException.throwMyException("用户权限不通过！");
            //return false;
        }

        return true;
    }

    /**
     * 请求访问controller之后，渲染视图之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 请求访问controller之后，渲染视图之后
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
