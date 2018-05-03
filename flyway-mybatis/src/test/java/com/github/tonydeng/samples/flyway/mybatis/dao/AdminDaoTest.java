package com.github.tonydeng.samples.flyway.mybatis.dao;

import com.github.tonydeng.samples.flyway.mybaits.dao.AdminDao;
import com.github.tonydeng.samples.flyway.mybaits.dao.entity.Admin;
import com.github.tonydeng.samples.flyway.mybatis.MyBaitsApplicationTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@Slf4j
public class AdminDaoTest extends MyBaitsApplicationTest {
    @Resource
    private AdminDao adminDao;

    @Test
    void testInsert() {
        log.info("test");
        Assertions.assertThrows(NullPointerException.class, () -> {
            adminDao.insert(new Admin());
        });
    }
}
