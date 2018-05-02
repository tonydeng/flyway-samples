package com.github.tonydeng.samples.flyway.hibernate;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class BaseTest {
    private static final Demo demo = new Demo();

    @Test
    void testBase() {
        log.info("test flyway mybatis!");
    }

    @Test
    void testSay() {
        String who = "Flyway";
        Assertions.assertEquals("Hello Flyway", demo.sayHello(who));
    }
}
