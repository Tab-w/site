package com.eric.site.web.dao;

import com.eric.site.web.entity.MenuAuthority;
import com.eric.site.web.entity.MenuAuthorityExample;
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

public interface MenuAuthorityMapper {
    @SelectProvider(type=MenuAuthoritySqlProvider.class, method="countByExample")
    long countByExample(MenuAuthorityExample example);

    @DeleteProvider(type=MenuAuthoritySqlProvider.class, method="deleteByExample")
    int deleteByExample(MenuAuthorityExample example);

    @Delete({
        "delete from sec_menu_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sec_menu_authority (id, menu_id, ",
        "authority_id, flag, ",
        "create_time, create_user, ",
        "modify_time, modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{menuId,jdbcType=BIGINT}, ",
        "#{authorityId,jdbcType=BIGINT}, #{flag,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=BIGINT}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{modifyUser,jdbcType=BIGINT})"
    })
    int insert(MenuAuthority record);

    @InsertProvider(type=MenuAuthoritySqlProvider.class, method="insertSelective")
    int insertSelective(MenuAuthority record);

    @SelectProvider(type=MenuAuthoritySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="authority_id", property="authorityId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<MenuAuthority> selectByExample(MenuAuthorityExample example);

    @Select({
        "select",
        "id, menu_id, authority_id, flag, create_time, create_user, modify_time, modify_user",
        "from sec_menu_authority",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="authority_id", property="authorityId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    MenuAuthority selectByPrimaryKey(Long id);

    @UpdateProvider(type=MenuAuthoritySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MenuAuthority record, @Param("example") MenuAuthorityExample example);

    @UpdateProvider(type=MenuAuthoritySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MenuAuthority record, @Param("example") MenuAuthorityExample example);

    @UpdateProvider(type=MenuAuthoritySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MenuAuthority record);

    @Update({
        "update sec_menu_authority",
        "set menu_id = #{menuId,jdbcType=BIGINT},",
          "authority_id = #{authorityId,jdbcType=BIGINT},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "modify_user = #{modifyUser,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(MenuAuthority record);

    @Select({
        "select",
        "id, menu_id, authority_id, flag, create_time, create_user, modify_time, modify_user",
        "from sec_menu_authority"
    })
    @Results(id = "menuauthority", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="authority_id", property="authorityId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<MenuAuthority> selectAll();
}