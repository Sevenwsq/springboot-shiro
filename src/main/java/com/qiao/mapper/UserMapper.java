package com.qiao.mapper;

import com.qiao.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Silent
 * @date 2019/11/17 10:18:50
 * @description
 */
@Repository
@Mapper
public interface UserMapper {
    @Select("select * from mybatis.user where name = #{name}")
    public User queryUserByName(String name);
    @Insert("insert into mybatis.user(name,pwd,perms,saltValue) values(#{name},#{pwd},#{perms},#{saltValue})")
    public void insertUser(User user);
}
