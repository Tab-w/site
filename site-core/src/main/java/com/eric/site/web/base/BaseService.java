package com.eric.site.web.base;

import com.eric.site.web.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
@Service
public interface BaseService<Entity extends BaseEntity, EntityExample> {

    long countByExample(EntityExample example);

    int deleteByExample(EntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Entity record);

    int insertSelective(Entity record);

    List<User> selectByExample(EntityExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Entity record, EntityExample example);

    int updateByExample(Entity record, EntityExample example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);

    List<User> selectAll();
}