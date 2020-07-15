package com.sucaisheng.study_springboot;

import com.sucaisheng.study_springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StudySpringbootApplicationTests {
    Logger logger = LoggerFactory.getLogger(StudySpringbootApplicationTests.class);
    @Autowired
    User user;
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(user);
    }

    @Test
    void testFn(){
        System.out.println("123456789");
        logger.trace("这是一个trace日志");
        logger.debug("这是一个debug日志");
        logger.info("这是一个info日志");
        logger.warn("这是一个warn日志");
        logger.error("这是一个error日志");
    }

    @Test
    void testFn1(){
        System.out.println("JdbcFn---" + dataSource.getClass());
        try {
            System.out.println("JdbcFn---" + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
