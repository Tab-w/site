package com.eric.site.web.service;

import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
@Service
public class UserServiceImpl implements BaseService<User> {

    @Autowired
    private UserMapper mapper;

    @Override
    public int insert(User entity) {
        return mapper.insert(entity);
    }

    @Override
    public int insertSelective(User entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(User entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateByPrimaryKeySelective(User entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return mapper.selectAll();
    }
}