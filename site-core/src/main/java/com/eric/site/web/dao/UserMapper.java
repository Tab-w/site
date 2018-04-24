package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @SelectProvider(type = UserSqlProvider.class, method = "countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type = UserSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
            "delete from sys_user",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
            "insert into sys_user (id, username, ",
            "full_name, password, login_count, ",
            "login_time, last_login_time, ",
            "email, phone, group_id, ",
            "enabled, account_non_expired, ",
            "account_non_locked, credentials_non_expired, ",
            "flag, create_time, ",
            "create_user, modify_time, ",
            "modify_user)",
            "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=CHAR}, ",
            "#{fullName,jdbcType=CHAR}, #{password,jdbcType=CHAR}, #{loginCount,jdbcType=INTEGER}, ",
            "#{loginTime,jdbcType=TIMESTAMP}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
            "#{email,jdbcType=CHAR}, #{phone,jdbcType=INTEGER}, #{groupId,jdbcType=BIGINT}, ",
            "#{enabled,jdbcType=BIT}, #{accountNonExpired,jdbcType=BIT}, ",
            "#{accountNonLocked,jdbcType=BIT}, #{credentialsNonExpired,jdbcType=BIT}, ",
            "#{flag,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
            "#{createUser,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
            "#{modifyUser,jdbcType=BIGINT})"
    })
    int insert(User record);

    @InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
    int insertSelective(User record);

    @SelectProvider(type = UserSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.CHAR),
            @Result(column = "full_name", property = "fullName", jdbcType = JdbcType.CHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.CHAR),
            @Result(column = "login_count", property = "loginCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "last_login_time", property = "lastLoginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "email", property = "email", jdbcType = JdbcType.CHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.INTEGER),
            @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.BIGINT),
            @Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_expired", property = "accountNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_locked", property = "accountNonLocked", jdbcType = JdbcType.BIT),
            @Result(column = "credentials_non_expired", property = "credentialsNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    List<User> selectByExample(UserExample example);

    @Select({
            "select",
            "id, username, full_name, password, login_count, login_time, last_login_time, ",
            "email, phone, group_id, enabled, account_non_expired, account_non_locked, credentials_non_expired, ",
            "flag, create_time, create_user, modify_time, modify_user",
            "from sys_user",
            "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.CHAR),
            @Result(column = "full_name", property = "fullName", jdbcType = JdbcType.CHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.CHAR),
            @Result(column = "login_count", property = "loginCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "last_login_time", property = "lastLoginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "email", property = "email", jdbcType = JdbcType.CHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.INTEGER),
            @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.BIGINT),
            @Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_expired", property = "accountNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_locked", property = "accountNonLocked", jdbcType = JdbcType.BIT),
            @Result(column = "credentials_non_expired", property = "credentialsNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
            "update sys_user",
            "set username = #{username,jdbcType=CHAR},",
            "full_name = #{fullName,jdbcType=CHAR},",
            "password = #{password,jdbcType=CHAR},",
            "login_count = #{loginCount,jdbcType=INTEGER},",
            "login_time = #{loginTime,jdbcType=TIMESTAMP},",
            "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
            "email = #{email,jdbcType=CHAR},",
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
            "id, username, full_name, password, login_count, login_time, last_login_time, ",
            "email, phone, group_id, enabled, account_non_expired, account_non_locked, credentials_non_expired, ",
            "flag, create_time, create_user, modify_time, modify_user",
            "from sys_user"
    })
    @Results(id = "user", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.CHAR),
            @Result(column = "full_name", property = "fullName", jdbcType = JdbcType.CHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.CHAR),
            @Result(column = "login_count", property = "loginCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "last_login_time", property = "lastLoginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "email", property = "email", jdbcType = JdbcType.CHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.INTEGER),
            @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.BIGINT),
            @Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_expired", property = "accountNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_locked", property = "accountNonLocked", jdbcType = JdbcType.BIT),
            @Result(column = "credentials_non_expired", property = "credentialsNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    List<User> selectAll();

    @Select({
            "select",
            "u.id, u.username, u.full_name, u.password, u.login_count, u.login_time, u.last_login_time, ",
            "u.email, u.phone, u.group_id, u.enabled, u.account_non_expired, u.account_non_locked, u.credentials_non_expired, ",
            "u.flag, u.create_time, u.create_user, u.modify_time, u.modify_user, ur.role_id",
            "from sys_user u",
            "inner join sys_user_role ur ON u.id = ur.user_id",
            "where u.username = #{username}"
    })
    @Results(id = "userWithRoles", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.CHAR),
            @Result(column = "full_name", property = "fullName", jdbcType = JdbcType.CHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.CHAR),
            @Result(column = "login_count", property = "loginCount", jdbcType = JdbcType.INTEGER),
            @Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "last_login_time", property = "lastLoginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "email", property = "email", jdbcType = JdbcType.CHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.INTEGER),
            @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.BIGINT),
            @Result(column = "enabled", property = "enabled", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_expired", property = "accountNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "account_non_locked", property = "accountNonLocked", jdbcType = JdbcType.BIT),
            @Result(column = "credentials_non_expired", property = "credentialsNonExpired", jdbcType = JdbcType.BIT),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "role_id", property = "roles", javaType = List.class, many = @Many(select = "com.eric.site.web.dao.RoleMapper.selectByPrimaryKey"))
    })
    User selectUserWithRoles(@Param("username") String username);
}