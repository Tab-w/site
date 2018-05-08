package com.eric.site.web.controller.commons;

import com.eric.site.web.common.BaseController;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import com.eric.site.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Eric
 */
@Controller

public class LoginController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginGet(Model model, @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.addAttribute("error", "用户名或密码错误");
        }
        return "/login";
    }

    @PostMapping("/login")
    public String loginPost(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> users = userService.selectByExample(userExample);
        if (users != null && users.size() > 0) {
            return "/admin";
        } else {
            return "/login";
        }
    }
}
