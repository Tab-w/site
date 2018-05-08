package com.eric.site.web.dao;

import com.eric.site.web.entity.RoleMenu;
import com.eric.site.web.entity.RoleMenuExample;
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

public interface RoleMenuMapper {
    @SelectProvider(type=RoleMenuSqlProvider.class, method="countByExample")
    long countByExample(RoleMenuExample example);

    @DeleteProvider(type=RoleMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleMenuExample example);

    @Delete({
        "delete from sec_role_menu",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sec_role_menu (id, role_id, ",
        "menu_id, flag, create_time, ",
        "create_user, modify_time, ",
        "modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{roleId,jdbcType=BIGINT}, ",
        "#{menuId,jdbcType=BIGINT}, #{flag,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{modifyUser,jdbcType=BIGINT})"
    })
    int insert(RoleMenu record);

    @InsertProvider(type=RoleMenuSqlProvider.class, method="insertSelective")
    int insertSelective(RoleMenu record);

    @SelectProvider(type=RoleMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<RoleMenu> selectByExampleWithRowbounds(RoleMenuExample example, RowBounds rowBounds);

    @SelectProvider(type=RoleMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<RoleMenu> selectByExample(RoleMenuExample example);

    @Select({
        "select",
        "id, role_id, menu_id, flag, create_time, create_user, modify_time, modify_user",
        "from sec_role_menu",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    RoleMenu selectByPrimaryKey(Long id);

    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    @UpdateProvider(type=RoleMenuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RoleMenu record);

    @Update({
        "update sec_role_menu",
        "set role_id = #{roleId,jdbcType=BIGINT},",
          "menu_id = #{menuId,jdbcType=BIGINT},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "modify_user = #{modifyUser,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RoleMenu record);

    @Select({
        "select",
        "id, role_id, menu_id, flag, create_time, create_user, modify_time, modify_user",
        "from sec_role_menu"
    })
    @Results(id = "rolemenu", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<RoleMenu> selectAll();
}