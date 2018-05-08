package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.MenuAuthorityMapper;
import com.eric.site.web.entity.MenuAuthority;
import com.eric.site.web.entity.MenuAuthorityExample;
import com.eric.site.web.service.MenuAuthorityService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class MenuAuthorityServiceImpl implements MenuAuthorityService {

    @Resource
    private MenuAuthorityMapper mapper;

    @Override
    public long countByExample(MenuAuthorityExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MenuAuthorityExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MenuAuthority record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(MenuAuthority record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<MenuAuthority> selectByExampleWithRowbounds(MenuAuthorityExample example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<MenuAuthority> selectByExample(MenuAuthorityExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public MenuAuthority selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MenuAuthority record, MenuAuthorityExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MenuAuthority record, MenuAuthorityExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuAuthority record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MenuAuthority record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<MenuAuthority> selectAll() {
        return mapper.selectAll();
    }
}