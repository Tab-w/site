package com.eric.site.web.base;

import com.eric.site.web.base.BaseEntity;
import com.eric.site.web.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangXingYu
 * @date 2018-01-31
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

    int updateByExampleSelective(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByExample(@Param("record") Entity record, @Param("example") EntityExample example);

    int updateByPrimaryKeySelective(Entity record);

    int updateByPrimaryKey(Entity record);

    List<User> selectAll();
}