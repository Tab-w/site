package com.eric.site.web.dao;

import com.eric.site.web.entity.Role;
import com.eric.site.web.entity.RoleExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RoleMapper {
    @SelectProvider(type = RoleSqlProvider.class, method = "countByExample")
    long countByExample(RoleExample example);

    @DeleteProvider(type = RoleSqlProvider.class, method = "deleteByExample")
    int deleteByExample(RoleExample example);

    @Delete({
            "delete from sys_role",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
            "insert into sys_role (id, role_name, ",
            "description, flag, ",
            "create_time, create_user, ",
            "modify_time, modify_user)",
            "values (#{id,jdbcType=BIGINT}, #{roleName,jdbcType=CHAR}, ",
            "#{description,jdbcType=VARCHAR}, #{flag,jdbcType=INTEGER}, ",
            "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=BIGINT}, ",
            "#{modifyTime,jdbcType=TIMESTAMP}, #{modifyUser,jdbcType=BIGINT})"
    })
    int insert(Role record);

    @InsertProvider(type = RoleSqlProvider.class, method = "insertSelective")
    int insertSelective(Role record);

    @SelectProvider(type = RoleSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.CHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    List<Role> selectByExample(RoleExample example);

    @Select({
            "select",
            "id, role_name, description, flag, create_time, create_user, modify_time, modify_user",
            "from sys_role",
            "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.CHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    Role selectByPrimaryKey(Long id);

    @UpdateProvider(type = RoleSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type = RoleSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    @UpdateProvider(type = RoleSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
            "update sys_role",
            "set role_name = #{roleName,jdbcType=CHAR},",
            "description = #{description,jdbcType=VARCHAR},",
            "flag = #{flag,jdbcType=INTEGER},",
            "create_time = #{createTime,jdbcType=TIMESTAMP},",
            "create_user = #{createUser,jdbcType=BIGINT},",
            "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
            "modify_user = #{modifyUser,jdbcType=BIGINT}",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Role record);

    @Select({
            "select",
            "id, role_name, description, flag, create_time, create_user, modify_time, modify_user",
            "from sys_role"
    })
    @Results(id = "role", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.CHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT)
    })
    List<Role> selectAll();

    @Select({
            "select",
            "r.id, r.role_name, r.description, r.flag, r.create_time, r.create_user, r.modify_time, r.modify_user, ra.authority_id",
            "from sys_role r",
            "inner join sys_role_authority ra on r.id = ra.role_id",
            "where r.id = #{id}"
    })
    @Results(id = "roleWithAuthorities", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "role_name", property = "roleName", jdbcType = JdbcType.CHAR),
            @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
            @Result(column = "flag", property = "flag", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "create_user", property = "createUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "modify_time", property = "modifyTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "modify_user", property = "modifyUser", jdbcType = JdbcType.BIGINT),
            @Result(column = "authority_id", property = "authorities", javaType = List.class, many = @Many(select = "com.eric.site.web.dao.AuthorityMapper.selectByPrimaryKey"))
    })
    Role selectRoleWithAuthorities(@Param("id") long id);
}