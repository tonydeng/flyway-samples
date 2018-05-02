package com.github.tonydeng.samples.flyway.mybaits;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {

   public String sayHello(String who) {
        log.info("say hello {}.......", who);
        return "Hello " + who;
    }
}
