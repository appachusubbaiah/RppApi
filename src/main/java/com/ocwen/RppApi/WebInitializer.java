package com.ocwen.RppApi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.ocwen.RppApi"})
@ComponentScan(basePackages = {"com.ocwen.RppApi","com.ocwen.services","com.ocwen.repositories"})
public class WebInitializer extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
        return application.sources(WebInitializer.class);
    }   
}
