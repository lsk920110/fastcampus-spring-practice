package com.fastcampus.springpractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice")
//스프링 전용 컨피그 클래스가 되었음
@Configuration
public class Config {


}
