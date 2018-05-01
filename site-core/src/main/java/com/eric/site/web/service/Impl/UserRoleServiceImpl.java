package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.UserRoleMapper;
import com.eric.site.web.entity.UserRole;
import com.eric.site.web.entity.UserRoleExample;
import com.eric.site.web.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleMapper mapper;

    @Override
    public long countByExample(UserRoleExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserRoleExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserRole record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<UserRole> selectByExample(UserRoleExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public UserRole selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(UserRole record, UserRoleExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UserRole record, UserRoleExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<UserRole> selectAll() {
        return mapper.selectAll();
    }
}