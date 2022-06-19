package com.gc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

//    页面跳转   url 到视图的映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("login.html");
        registry.addViewController("/login").setViewName("login.html");//配置登录页面
        registry.addViewController("/paw").setViewName("password.html");//配置密码页面
        registry.addViewController("/ind").setViewName("index.html");//配置首页页面
        registry.addViewController("/home").setViewName("basic/home.html");//配置首页页面

    }
    //自定义的国际化组件
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}
