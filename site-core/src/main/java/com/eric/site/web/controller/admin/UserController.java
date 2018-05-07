package com.eric.site.web.controller.admin;

import com.alibaba.fastjson.JSON;
import com.eric.site.web.base.BaseController;
import com.eric.site.web.base.Page;
import com.eric.site.web.entity.User;
import com.eric.site.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: Eric
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired()
    private UserService userService;

    @RequestMapping
    public String index(Model model) {
        return "user";
    }

    @PostMapping("list")
    public String list(int start, int length, int draw) {
        Page<User> page = new Page<User>(userService.selectAll(), draw, 10, 4);
        return page.toJson();
    }
}