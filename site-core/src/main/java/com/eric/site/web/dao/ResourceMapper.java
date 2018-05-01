package com.eric.site.web.dao;

import com.eric.site.web.entity.Resource;
import com.eric.site.web.entity.ResourceExample;
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

public interface ResourceMapper {
    @SelectProvider(type=ResourceSqlProvider.class, method="countByExample")
    long countByExample(ResourceExample example);

    @DeleteProvider(type=ResourceSqlProvider.class, method="deleteByExample")
    int deleteByExample(ResourceExample example);

    @Delete({
        "delete from sec_resource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into sec_resource (id, code, ",
        "type, path, home_page, ",
        "module_id, name, menu_id, ",
        "seq, is_menu, flag, ",
        "create_time, create_user, ",
        "modify_time, modify_user)",
        "values (#{id,jdbcType=BIGINT}, #{code,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{path,jdbcType=VARCHAR}, #{homePage,jdbcType=VARCHAR}, ",
        "#{moduleId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{menuId,jdbcType=BIGINT}, ",
        "#{seq,jdbcType=BIGINT}, #{isMenu,jdbcType=BIT}, #{flag,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=BIGINT}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{modifyUser,jdbcType=BIGINT})"
    })
    int insert(Resource record);

    @InsertProvider(type=ResourceSqlProvider.class, method="insertSelective")
    int insertSelective(Resource record);

    @SelectProvider(type=ResourceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_page", property="homePage", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="seq", property="seq", jdbcType=JdbcType.BIGINT),
        @Result(column="is_menu", property="isMenu", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Resource> selectByExample(ResourceExample example);

    @Select({
        "select",
        "id, code, type, path, home_page, module_id, name, menu_id, seq, is_menu, flag, ",
        "create_time, create_user, modify_time, modify_user",
        "from sec_resource",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_page", property="homePage", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="seq", property="seq", jdbcType=JdbcType.BIGINT),
        @Result(column="is_menu", property="isMenu", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    Resource selectByPrimaryKey(Long id);

    @UpdateProvider(type=ResourceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    @UpdateProvider(type=ResourceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    @UpdateProvider(type=ResourceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Resource record);

    @Update({
        "update sec_resource",
        "set code = #{code,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "path = #{path,jdbcType=VARCHAR},",
          "home_page = #{homePage,jdbcType=VARCHAR},",
          "module_id = #{moduleId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "menu_id = #{menuId,jdbcType=BIGINT},",
          "seq = #{seq,jdbcType=BIGINT},",
          "is_menu = #{isMenu,jdbcType=BIT},",
          "flag = #{flag,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "modify_user = #{modifyUser,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Resource record);

    @Select({
        "select",
        "id, code, type, path, home_page, module_id, name, menu_id, seq, is_menu, flag, ",
        "create_time, create_user, modify_time, modify_user",
        "from sec_resource"
    })
    @Results(id = "resource", value= {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR),
        @Result(column="home_page", property="homePage", jdbcType=JdbcType.VARCHAR),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.BIGINT),
        @Result(column="seq", property="seq", jdbcType=JdbcType.BIGINT),
        @Result(column="is_menu", property="isMenu", jdbcType=JdbcType.BIT),
        @Result(column="flag", property="flag", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.BIGINT),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="modify_user", property="modifyUser", jdbcType=JdbcType.BIGINT)
    })
    List<Resource> selectAll();
}