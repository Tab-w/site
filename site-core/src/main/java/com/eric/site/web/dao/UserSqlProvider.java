package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sec_user");
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.VALUES("enabled", "#{enabled,jdbcType=VARCHAR}");
        }
        
        if (record.getFullname() != null) {
            sql.VALUES("fullname", "#{fullname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPlainPassword() != null) {
            sql.VALUES("plainPassword", "#{plainPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            sql.VALUES("salt", "#{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getFid() != null) {
            sql.VALUES("fid", "#{fid,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.VALUES("org", "#{org,jdbcType=INTEGER}");
        }
        
        if (record.getUser_mobile() != null) {
            sql.VALUES("user_mobile", "#{user_mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTid() != null) {
            sql.VALUES("tid", "#{tid,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_user() != null) {
            sql.VALUES("create_user", "#{create_user,jdbcType=INTEGER}");
        }
        
        if (record.getCreate_time() != null) {
            sql.VALUES("create_time", "#{create_time,jdbcType=VARCHAR}");
        }
        
        if (record.getM_number() != null) {
            sql.VALUES("m_number", "#{m_number,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdvalid() != null) {
            sql.VALUES("pwdvalid", "#{pwdvalid,jdbcType=VARCHAR}");
        }
        
        if (record.getDef_pwd() != null) {
            sql.VALUES("def_pwd", "#{def_pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getStart_menu_id() != null) {
            sql.VALUES("start_menu_id", "#{start_menu_id,jdbcType=INTEGER}");
        }
        
        if (record.getPwdupdatetime() != null) {
            sql.VALUES("pwdupdatetime", "#{pwdupdatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getPerson_id() != null) {
            sql.VALUES("person_id", "#{person_id,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("sec_user");
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("enabled = #{enabled,jdbcType=VARCHAR}");
        }
        
        if (record.getFullname() != null) {
            sql.SET("fullname = #{fullname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPlainPassword() != null) {
            sql.SET("plainPassword = #{plainPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            sql.SET("salt = #{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getFid() != null) {
            sql.SET("fid = #{fid,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.SET("org = #{org,jdbcType=INTEGER}");
        }
        
        if (record.getUser_mobile() != null) {
            sql.SET("user_mobile = #{user_mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTid() != null) {
            sql.SET("tid = #{tid,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_user() != null) {
            sql.SET("create_user = #{create_user,jdbcType=INTEGER}");
        }
        
        if (record.getCreate_time() != null) {
            sql.SET("create_time = #{create_time,jdbcType=VARCHAR}");
        }
        
        if (record.getM_number() != null) {
            sql.SET("m_number = #{m_number,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdvalid() != null) {
            sql.SET("pwdvalid = #{pwdvalid,jdbcType=VARCHAR}");
        }
        
        if (record.getDef_pwd() != null) {
            sql.SET("def_pwd = #{def_pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getStart_menu_id() != null) {
            sql.SET("start_menu_id = #{start_menu_id,jdbcType=INTEGER}");
        }
        
        if (record.getPwdupdatetime() != null) {
            sql.SET("pwdupdatetime = #{pwdupdatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getPerson_id() != null) {
            sql.SET("person_id = #{person_id,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}