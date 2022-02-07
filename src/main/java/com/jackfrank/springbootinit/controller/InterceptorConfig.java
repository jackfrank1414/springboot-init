package com.jackfrank.springbootinit.controller;

import com.jackfrank.springbootinit.controller.intercepyor.UserInfoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * TODO
 *
 * @author jackfrank
 * @version 1.0
 * @date 2022/1/29 21:23
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    public UserInfoInterceptor userInfoInterceptor(){
        return new UserInfoInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(userInfoInterceptor())
                .addPathPatterns("/upload");
    }
}
