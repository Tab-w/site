package com.eric.site.web.service;

import com.eric.site.web.entity.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
@Service
public interface BaseService<Entity extends BaseEntity> {

    int insert(Entity entity);

    int insertSelective(Entity entity);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Entity entity);

    int updateByPrimaryKeySelective(Entity entity);

    Entity selectByPrimaryKey(Integer id);

    List<Entity> selectAll();
}