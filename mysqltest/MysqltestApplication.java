package com.example.mysqltest;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class MysqltestApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(MysqltestApplication.class, args);
//    }
//
//}


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.mysqltest.dao")
public class MysqltestApplication {
    public static void main(String[] args) {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(MysqltestApplication.class, args);
        System.out.println("程序正在运行...");
    }
}