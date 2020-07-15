package com.sucaisheng.study_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//用MapperScan扫描Mapper包，替换里面的所有@Mapper
@MapperScan("com.sucaisheng.study_springboot.mapper")
public class StudySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringbootApplication.class, args);
    }

}
