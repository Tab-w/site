package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.RoleMenuMapper;
import com.eric.site.web.entity.RoleMenu;
import com.eric.site.web.entity.RoleMenuExample;
import com.eric.site.web.service.RoleMenuService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Resource
    private RoleMenuMapper mapper;

    @Override
    public long countByExample(RoleMenuExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RoleMenuExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleMenu record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(RoleMenu record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<RoleMenu> selectByExampleWithRowbounds(RoleMenuExample example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<RoleMenu> selectByExample(RoleMenuExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public RoleMenu selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(RoleMenu record, RoleMenuExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RoleMenu record, RoleMenuExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleMenu record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleMenu record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<RoleMenu> selectAll() {
        return mapper.selectAll();
    }
}