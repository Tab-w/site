package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Delete({
        "delete from sec_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into sec_user (address, age, ",
        "email, enabled, ",
        "fullname, password, ",
        "plainPassword, salt, ",
        "sex, fid, type, ",
        "username, org, user_mobile, ",
        "tid, remark, create_user, ",
        "create_time, m_number, ",
        "pwdvalid, def_pwd, ",
        "start_menu_id, pwdupdatetime, ",
        "person_id)",
        "values (#{address,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER}, ",
        "#{email,jdbcType=VARCHAR}, #{enabled,jdbcType=VARCHAR}, ",
        "#{fullname,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{plainPassword,jdbcType=VARCHAR}, #{salt,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=VARCHAR}, #{fid,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{username,jdbcType=VARCHAR}, #{org,jdbcType=INTEGER}, #{user_mobile,jdbcType=VARCHAR}, ",
        "#{tid,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, #{create_user,jdbcType=INTEGER}, ",
        "#{create_time,jdbcType=VARCHAR}, #{m_number,jdbcType=VARCHAR}, ",
        "#{pwdvalid,jdbcType=VARCHAR}, #{def_pwd,jdbcType=VARCHAR}, ",
        "#{start_menu_id,jdbcType=INTEGER}, #{pwdupdatetime,jdbcType=VARCHAR}, ",
        "#{person_id,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(User record);

    @Select({
        "select",
        "id, address, age, email, enabled, fullname, password, plainPassword, salt, sex, ",
        "fid, type, username, org, user_mobile, tid, remark, create_user, create_time, ",
        "m_number, pwdvalid, def_pwd, start_menu_id, pwdupdatetime, person_id",
        "from sec_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.VARCHAR),
        @Result(column="fullname", property="fullname", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="plainPassword", property="plainPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="fid", property="fid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="org", property="org", jdbcType=JdbcType.INTEGER),
        @Result(column="user_mobile", property="user_mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="tid", property="tid", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="create_user", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="create_time", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_number", property="m_number", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwdvalid", property="pwdvalid", jdbcType=JdbcType.VARCHAR),
        @Result(column="def_pwd", property="def_pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_menu_id", property="start_menu_id", jdbcType=JdbcType.INTEGER),
        @Result(column="pwdupdatetime", property="pwdupdatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_id", property="person_id", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update sec_user",
        "set address = #{address,jdbcType=VARCHAR},",
          "age = #{age,jdbcType=INTEGER},",
          "email = #{email,jdbcType=VARCHAR},",
          "enabled = #{enabled,jdbcType=VARCHAR},",
          "fullname = #{fullname,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "plainPassword = #{plainPassword,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "fid = #{fid,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "username = #{username,jdbcType=VARCHAR},",
          "org = #{org,jdbcType=INTEGER},",
          "user_mobile = #{user_mobile,jdbcType=VARCHAR},",
          "tid = #{tid,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_user = #{create_user,jdbcType=INTEGER},",
          "create_time = #{create_time,jdbcType=VARCHAR},",
          "m_number = #{m_number,jdbcType=VARCHAR},",
          "pwdvalid = #{pwdvalid,jdbcType=VARCHAR},",
          "def_pwd = #{def_pwd,jdbcType=VARCHAR},",
          "start_menu_id = #{start_menu_id,jdbcType=INTEGER},",
          "pwdupdatetime = #{pwdupdatetime,jdbcType=VARCHAR},",
          "person_id = #{person_id,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select({
        "select",
        "id, address, age, email, enabled, fullname, password, plainPassword, salt, sex, ",
        "fid, type, username, org, user_mobile, tid, remark, create_user, create_time, ",
        "m_number, pwdvalid, def_pwd, start_menu_id, pwdupdatetime, person_id",
        "from sec_user"
    })
    @Results(id = "user", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.VARCHAR),
        @Result(column="fullname", property="fullname", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="plainPassword", property="plainPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="fid", property="fid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="org", property="org", jdbcType=JdbcType.INTEGER),
        @Result(column="user_mobile", property="user_mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="tid", property="tid", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="create_user", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="create_time", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_number", property="m_number", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwdvalid", property="pwdvalid", jdbcType=JdbcType.VARCHAR),
        @Result(column="def_pwd", property="def_pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_menu_id", property="start_menu_id", jdbcType=JdbcType.INTEGER),
        @Result(column="pwdupdatetime", property="pwdupdatetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_id", property="person_id", jdbcType=JdbcType.INTEGER)
    })
    List<User> selectAll();
}