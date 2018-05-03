package com.github.tonydeng.samples.flyway.mybaits;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyBatisApplication {

    public static void main(String[] args) {
        log.info("start mybatis application.......");
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
