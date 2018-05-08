package com.eric.site.web.dao;

import com.eric.site.web.entity.Authority;
import com.eric.site.web.entity.AuthorityExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface AuthorityMapper {
    @SelectProvider(type=AuthoritySqlProvider.class, method="countByExample")
    long countByExample(AuthorityExample example);

    @DeleteProvider(type=AuthoritySqlProvider.class, method="deleteByExample")
    int deleteByExample(AuthorityExample example);

    @Delete({
        "delete from sec_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sec_authority (id, code, ",
        "name, description, ",
        "flag, create_time, ",
        "create_user, modify_time, ",
        "modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{modifyUser,jdbcType=BIGINT})"
    })
    int insert(Authority record);

    @InsertProvider(type=AuthoritySqlProvider.class, method="insertSelective")
    int insertSelective(Authority record);

    @SelectProvider(type=AuthoritySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Authority> selectByExampleWithRowbounds(AuthorityExample example, RowBounds rowBounds);

    @SelectProvider(type=AuthoritySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
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
        "id, code, name, description, flag, create_time, create_user, modify_time, modify_user",
        "from sec_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
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
        "update sec_authority",
        "set code = #{code,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
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
        "id, code, name, description, flag, create_time, create_user, modify_time, modify_user",
        "from sec_authority"
    })
    @Results(id = "authority", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Authority> selectAll();

    //==========以下为手动添加==========

    @Select({
            "SELECT",
            "authority.id id, authority.CODE CODE, authority.NAME NAME, authority.description description,",
            "authority.flag flag, authority.create_time create_time, authority.create_user create_user, authority.modify_time modify_time, authority.modify_user modify_user",
            "FROM sec_role_menu rm",
            "INNER JOIN sec_user_role ur ON ur.role_id = rm.role_id AND ur.user_id = #{userId}",
            "INNER JOIN sec_menu_authority ma ON ma.menu_id = rm.menu_id",
            "INNER JOIN sec_authority authority ON authority.id = ma.authority_id"
    })
    @ResultMap(value = "authority")
    List<Authority> selectAllAuthoritiesByUserId(@Param("userId") long userId);
}