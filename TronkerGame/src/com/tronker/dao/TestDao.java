package com.tronker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tronker.entity.TestBean;

public interface TestDao {
    List<TestBean> getTest(@Param("id")String id);
}
