package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.RoleMapper;
import com.eric.site.web.entity.Role;
import com.eric.site.web.entity.RoleExample;
import com.eric.site.web.service.RoleService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper mapper;

    @Override
    public long countByExample(RoleExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RoleExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Role> selectByExampleWithRowbounds(RoleExample example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<Role> selectByExample(RoleExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Role selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Role record, RoleExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Role record, RoleExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> selectAll() {
        return mapper.selectAll();
    }
}