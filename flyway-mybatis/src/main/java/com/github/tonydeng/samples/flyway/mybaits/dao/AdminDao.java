package com.github.tonydeng.samples.flyway.mybaits.dao;

import com.github.tonydeng.samples.flyway.mybaits.dao.entity.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface AdminDao {
    @Insert("insert into admin (username, password, gmt_created, gmt_modified, status) " +
            "values (#{username}, #{password}, #{gmtCreated}, #{gmtModified}, #{status})")
    @Options(useGeneratedKeys = true)
    Integer insert(Admin admin);
}
