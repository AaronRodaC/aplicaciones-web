package com.tienda;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registro) {
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/ejemplo2").setViewName("ejemplo2");
        registro.addViewController("/multimedia").setViewName("multimedia");
        registro.addViewController("/iframes").setViewName("iframes");

    }

}
