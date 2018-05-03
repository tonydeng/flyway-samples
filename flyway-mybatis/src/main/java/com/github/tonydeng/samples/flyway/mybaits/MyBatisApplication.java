package com.github.tonydeng.samples.flyway.mybaits;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("com.github.tonydeng.samples.flyway.mybaits.dao")
@SpringBootApplication(scanBasePackages = {"com.github.tonydeng.samples.flyway.mybaits"})
public class MyBatisApplication {

    public static void main(String[] args) {
        log.info("start mybatis application.......");
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
