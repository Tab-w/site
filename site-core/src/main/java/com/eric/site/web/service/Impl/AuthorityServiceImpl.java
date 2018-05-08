package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.AuthorityMapper;
import com.eric.site.web.entity.Authority;
import com.eric.site.web.entity.AuthorityExample;
import com.eric.site.web.service.AuthorityService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Resource
    private AuthorityMapper mapper;

    @Override
    public long countByExample(AuthorityExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthorityExample example) {
        return mapper.deleteByExample(example);
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
    public List<Authority> selectByExampleWithRowbounds(AuthorityExample example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<Authority> selectByExample(AuthorityExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Authority selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Authority record, AuthorityExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Authority record, AuthorityExample example) {
        return mapper.updateByExample(record, example);
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