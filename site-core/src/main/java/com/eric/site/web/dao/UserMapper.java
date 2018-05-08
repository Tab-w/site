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
import org.apache.ibatis.session.RowBounds;
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
        "password, login_count, ",
        "login_time, last_login_time, ",
        "full_name, email, phone, ",
        "group_id, enabled, account_non_expired, ",
        "account_non_locked, credentials_non_expired, ",
        "flag, create_time, ",
        "create_user, modify_time, ",
        "modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{loginCount,jdbcType=INTEGER}, ",
        "#{loginTime,jdbcType=TIMESTAMP}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{fullName,jdbcType=CHAR}, #{email,jdbcType=VARCHAR}, #{phone,jdbcType=INTEGER}, ",
        "#{groupId,jdbcType=BIGINT}, #{enabled,jdbcType=BIT}, #{accountNonExpired,jdbcType=BIT}, ",
        "#{accountNonLocked,jdbcType=BIT}, #{credentialsNonExpired,jdbcType=BIT}, ",
        "#{flag,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{modifyUser,jdbcType=BIGINT})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT),
        @Result(column="account_non_expired", property="accountNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="account_non_locked", property="accountNonLocked", jdbcType=JdbcType.BIT),
        @Result(column="credentials_non_expired", property="credentialsNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT),
        @Result(column="account_non_expired", property="accountNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="account_non_locked", property="accountNonLocked", jdbcType=JdbcType.BIT),
        @Result(column="credentials_non_expired", property="credentialsNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, username, password, login_count, login_time, last_login_time, full_name, ",
        "email, phone, group_id, enabled, account_non_expired, account_non_locked, credentials_non_expired, ",
        "flag, create_time, create_user, modify_time, modify_user",
        "from sec_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT),
        @Result(column="account_non_expired", property="accountNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="account_non_locked", property="accountNonLocked", jdbcType=JdbcType.BIT),
        @Result(column="credentials_non_expired", property="credentialsNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
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
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "login_count = #{loginCount,jdbcType=INTEGER},",
          "login_time = #{loginTime,jdbcType=TIMESTAMP},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "full_name = #{fullName,jdbcType=CHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=INTEGER},",
          "group_id = #{groupId,jdbcType=BIGINT},",
          "enabled = #{enabled,jdbcType=BIT},",
          "account_non_expired = #{accountNonExpired,jdbcType=BIT},",
          "account_non_locked = #{accountNonLocked,jdbcType=BIT},",
          "credentials_non_expired = #{credentialsNonExpired,jdbcType=BIT},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "modify_user = #{modifyUser,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);

    @Select({
        "select",
        "id, username, password, login_count, login_time, last_login_time, full_name, ",
        "email, phone, group_id, enabled, account_non_expired, account_non_locked, credentials_non_expired, ",
        "flag, create_time, create_user, modify_time, modify_user",
        "from sec_user"
    })
    @Results(id = "user", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.CHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.INTEGER),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.BIT),
        @Result(column="account_non_expired", property="accountNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="account_non_locked", property="accountNonLocked", jdbcType=JdbcType.BIT),
        @Result(column="credentials_non_expired", property="credentialsNonExpired", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<User> selectAll();
}