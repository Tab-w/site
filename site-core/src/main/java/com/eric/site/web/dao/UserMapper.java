package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from sec_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sec_user (id, username, ",
        "password, email, phone, ",
        "full_name, flag, create_time, ",
        "modify_time)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=CHAR}, ",
        "#{password,jdbcType=CHAR}, #{email,jdbcType=CHAR}, #{phone,jdbcType=INTEGER}, ",
        "#{fullName,jdbcType=CHAR}, #{flag,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifyTime,jdbcType=TIMESTAMP})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.CHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, username, password, email, phone, full_name, flag, create_time, modify_time",
        "from sec_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.CHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update sec_user",
        "set username = #{username,jdbcType=CHAR},",
          "password = #{password,jdbcType=CHAR},",
          "email = #{email,jdbcType=CHAR},",
          "phone = #{phone,jdbcType=INTEGER},",
          "full_name = #{fullName,jdbcType=CHAR},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);

    @Select({
        "select",
        "id, username, password, email, phone, full_name, flag, create_time, modify_time",
        "from sec_user"
    })
    @Results(id = "user", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.CHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.CHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectAll();
}