package com.example.mysqltest.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;
import com.example.mysqltest.bean.User;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * 用户数据新增
     */
    @Insert("insert into user(user_id,user_name,user_level) values (#{id},#{name},#{level})")
    void addUser(User user);

    /**
     * 用户数据修改
     */
    @Update("update user set user_name=#{name},user_level=#{age} where user_id=#{id}")
    void updateUser(User user);

    /**
     * 用户数据删除
     */
    @Delete("delete from user where user_id=#{id}")
    void deleteUser(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT user_id,user_name,user_level FROM user where uer_name=#{userName}")
    User findByName(@Param("userName") String userName);

    /**
     * 查询所有
     */
    @Select("SELECT user_id,user_name,user_level FROM user")
    List<User> findAll();


}