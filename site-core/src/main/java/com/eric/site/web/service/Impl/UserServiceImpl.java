package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import com.eric.site.web.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public long countByExample(UserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectAll() {
        return mapper.selectAll();
    }
}