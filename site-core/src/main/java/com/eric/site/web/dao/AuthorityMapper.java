package com.eric.site.web.dao;

import com.eric.site.web.entity.Authority;
import com.eric.site.web.entity.AuthorityExample;
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

public interface AuthorityMapper {
    @SelectProvider(type=AuthoritySqlProvider.class, method="countByExample")
    long countByExample(AuthorityExample example);

    @DeleteProvider(type=AuthoritySqlProvider.class, method="deleteByExample")
    int deleteByExample(AuthorityExample example);

    @Delete({
        "delete from sys_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sys_authority (id, authority_name, ",
        "description, flag, ",
        "create_time, create_user, ",
        "modify_time, modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{authorityName,jdbcType=CHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{flag,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=BIGINT}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{modifyUser,jdbcType=BIGINT})"
    })
    int insert(Authority record);

    @InsertProvider(type=AuthoritySqlProvider.class, method="insertSelective")
    int insertSelective(Authority record);

    @SelectProvider(type=AuthoritySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="authority_name", property="authorityName", jdbcType=JdbcType.CHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Authority> selectByExample(AuthorityExample example);

    @Select({
        "select",
        "id, authority_name, description, flag, create_time, create_user, modify_time, ",
        "modify_user",
        "from sys_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="authority_name", property="authorityName", jdbcType=JdbcType.CHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    Authority selectByPrimaryKey(Long id);

    @UpdateProvider(type=AuthoritySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    @UpdateProvider(type=AuthoritySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

    @UpdateProvider(type=AuthoritySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Authority record);

    @Update({
        "update sys_authority",
        "set authority_name = #{authorityName,jdbcType=CHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "modify_user = #{modifyUser,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Authority record);

    @Select({
        "select",
        "id, authority_name, description, flag, create_time, create_user, modify_time, ",
        "modify_user",
        "from sys_authority"
    })
    @Results(id = "authority", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="authority_name", property="authorityName", jdbcType=JdbcType.CHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Authority> selectAll();
}