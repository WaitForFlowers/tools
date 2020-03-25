package com.sky.tools.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program:
 * @description:
 * @author: zwh
 * @create: 2020/3/20 11:15
 */
@Mapper
@Repository
public interface UserMapping {
    String findId(@Param("id") String id);
}
