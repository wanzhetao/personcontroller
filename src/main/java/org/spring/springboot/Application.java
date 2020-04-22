package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Administrator
 * @date 2018/04/22
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("org.spring.springboot.dao")
@ComponentScan({"org.spring.springboot","com.microservice.serviceRegister"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
