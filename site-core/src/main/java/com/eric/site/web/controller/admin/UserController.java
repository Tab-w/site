package com.eric.site.web.controller.admin;

import com.eric.site.web.common.BaseController;
import com.eric.site.web.common.DataTableParameter;
import com.eric.site.web.common.Page;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import com.eric.site.web.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: Eric
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired()
    private UserService userService;

    @RequestMapping
    public String index() {
        return "user";
    }

    @PostMapping("list")
    public String list(DataTableParameter dataTableParameter, User user) {
        RowBounds rowBounds = new RowBounds(dataTableParameter.getStart(), dataTableParameter.getLength());
        UserExample userExample = new UserExample();
        Optional.ofNullable(user.getId()).ifPresent(aLong -> userExample.createCriteria().andIdGreaterThan(5L));
        List<User> users = userService.selectByExampleWithRowbounds(userExample, rowBounds);
        long count = userService.countByExample(userExample);
        Page<User> page = new Page<>(users, dataTableParameter.getDraw(), count, count);
        return page.toJson();
    }
}