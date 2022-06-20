package com.example.demo.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        //configura las url's
        registry.addViewController("/WS/home").setViewName("WShome");
        registry.addViewController("/WS/").setViewName("WShome");
        registry.addViewController("/WS/hello").setViewName("WShello");
        registry.addViewController("/WS/login").setViewName("WSlogin");
        //agrega cuatro controladores de vista.
    }

}
