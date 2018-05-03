package com.github.tonydeng.samples.flyway.mybaits.dao.entity;

import lombok.Data;

@Data
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Long gmtCreated;
    private Long gmtModified;
    private Integer status = 1;
}
