package com.karas.skeleton.account.dao;

import com.karas.skeleton.account.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by karasying on 2016/10/27.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("DELETE USER")
    int delUserById(@Param("id")String id);

}