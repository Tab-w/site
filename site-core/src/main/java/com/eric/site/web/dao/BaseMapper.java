package com.eric.site.web.dao;

import com.eric.site.web.entity.BaseEntity;

import java.util.List;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
public interface BaseMapper<Entity extends BaseEntity> {

    /**
     * 增加
     *
     * @param entity 实体对象
     * @return 影响行数
     */
    int insert(Entity entity);

    /**
     * 非空字段增加
     *
     * @param entity 实体对象
     * @return 影响行数
     */
    int insertSelective(Entity entity);

    /**
     * 删除
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 修改
     *
     * @param entity 实体对象
     * @return 影响行数
     */
    int updateByPrimaryKey(Entity entity);

    /**
     * 非空字段修改
     *
     * @param entity 实体对象
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Entity entity);

    /**
     * 查询
     *
     * @param id 主键
     * @return 影响行数
     */
    Entity selectByPrimaryKey(Integer id);

    /**
     * 查询全部
     *
     * @return 影响行数
     */
    List<Entity> selectAll();
}