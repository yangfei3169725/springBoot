package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标记一个主程序类，说明这是一个spring boot应用
 */
@SpringBootApplication
public class HellowWorldMainApplication {
    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HellowWorldMainApplication.class,args);
    }

}
