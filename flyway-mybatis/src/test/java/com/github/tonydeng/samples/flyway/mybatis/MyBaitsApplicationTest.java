package com.github.tonydeng.samples.flyway.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@SpringBootTest(classes = MyBaitsApplicationTest.SpringTestConfiguration.class)
@ActiveProfiles
@ExtendWith(SpringExtension.class)
public class MyBaitsApplicationTest {

    @SpringBootApplication(scanBasePackages = {"com.github.tonydeng.samples.flyway.mybatis"})
    static class SpringTestConfiguration {
    }

    @Test
    public void testContextLoads() {
        log.info("test context loads");
    }
}
