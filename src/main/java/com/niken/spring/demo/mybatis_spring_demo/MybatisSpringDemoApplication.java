package com.niken.spring.demo.mybatis_spring_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.niken.spring.demo.mybatis_spring_demo.mapper")
public class MybatisSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringDemoApplication.class, args);
	}
}
