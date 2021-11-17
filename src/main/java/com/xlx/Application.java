package com.xlx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xianglongxiang
 * @title: Application
 * @projectName springboot-1
 * @date 2021/11/15 15:36
 */
@SpringBootApplication
//@MapperScan({"com.xlx.spring.generator.mapper","com.xlx."})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
