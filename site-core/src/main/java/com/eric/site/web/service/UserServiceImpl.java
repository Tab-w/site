package com.eric.site.web.service;

import com.eric.site.web.base.BaseService;
import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
@Service
public class UserServiceImpl implements BaseService<User, UserExample> {

    @Autowired
    private UserMapper mapper;


    @Override
    public long countByExample(UserExample userExample) {
        return mapper.countByExample(userExample);
    }

    @Override
    public int deleteByExample(UserExample userExample) {
        return mapper.deleteByExample(userExample);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
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
    public List<User> selectByExample(UserExample userExample) {
        return mapper.selectByExample(userExample);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample userExample) {
        return mapper.updateByExampleSelective(record, userExample);
    }

    @Override
    public int updateByExample(User record, UserExample userExample) {
        return mapper.updateByExample(record, userExample);
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