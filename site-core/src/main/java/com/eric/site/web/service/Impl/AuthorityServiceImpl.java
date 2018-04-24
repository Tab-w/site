package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.AuthorityMapper;
import com.eric.site.web.entity.AuthorityExample;
import com.eric.site.web.entity.Authority;
import com.eric.site.web.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityMapper mapper;

    @Override
    public long countByExample(AuthorityExample authorityExample) {
        return mapper.countByExample(authorityExample);
    }

    @Override
    public int deleteByExample(AuthorityExample authorityExample) {
        return mapper.deleteByExample(authorityExample);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Authority record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Authority record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Authority> selectByExample(AuthorityExample authorityExample) {
        return mapper.selectByExample(authorityExample);
    }

    @Override
    public Authority selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Authority record, AuthorityExample authorityExample) {
        return mapper.updateByExampleSelective(record, authorityExample);
    }

    @Override
    public int updateByExample(Authority record, AuthorityExample authorityExample) {
        return mapper.updateByExample(record, authorityExample);
    }

    @Override
    public int updateByPrimaryKeySelective(Authority record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Authority record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Authority> selectAll() {
        return mapper.selectAll();
    }
}