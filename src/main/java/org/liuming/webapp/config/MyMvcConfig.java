package org.liuming.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

//    //     我们自己编写一个视图解析，路由！
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // 视图跳转的控制！
//        registry.addViewController("/index").setViewName("login");
//        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/index.html").setViewName("login");
//    }




}
