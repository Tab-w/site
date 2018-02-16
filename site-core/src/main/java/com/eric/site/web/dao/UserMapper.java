package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from sec_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sec_user (username, password, ",
        "email, flag, createTime, ",
        "updateTime)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{flag,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.CHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, username, password, email, flag, createTime, updateTime",
        "from sec_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.CHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update sec_user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "flag = #{flag,jdbcType=CHAR},",
          "createTime = #{createTime,jdbcType=TIMESTAMP},",
          "updateTime = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select({
        "select",
        "id, username, password, email, flag, createTime, updateTime",
        "from sec_user"
    })
    @Results(id = "user", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.CHAR),
        @Result(column="createTime", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectAll();
}