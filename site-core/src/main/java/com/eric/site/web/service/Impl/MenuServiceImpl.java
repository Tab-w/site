package com.eric.site.web.service.Impl;

import com.eric.site.web.dao.MenuMapper;
import com.eric.site.web.entity.Menu;
import com.eric.site.web.entity.MenuExample;
import com.eric.site.web.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Eric
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuMapper mapper;

    @Override
    public long countByExample(MenuExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MenuExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Menu record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Menu record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Menu> selectByExample(MenuExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Menu selectByPrimaryKey(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Menu record, MenuExample example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Menu record, MenuExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Menu> selectAll() {
        return mapper.selectAll();
    }
}