package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.RoleMapper;
import com.eric.site.web.entity.Role;
import com.eric.site.web.entity.RoleExample;
import com.eric.site.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper mapper;

    @Override
    public long countByExample(RoleExample roleExample) {
        return mapper.countByExample(roleExample);
    }

    @Override
    public int deleteByExample(RoleExample roleExample) {
        return mapper.deleteByExample(roleExample);
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
    public List<Role> selectByExample(RoleExample roleExample) {
        return mapper.selectByExample(roleExample);
    }

    @Override
    public Role selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Role record, RoleExample roleExample) {
        return mapper.updateByExampleSelective(record, roleExample);
    }

    @Override
    public int updateByExample(Role record, RoleExample roleExample) {
        return mapper.updateByExample(record, roleExample);
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