package com.eric.site.web.controller.admin;

import com.eric.site.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Eric
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        return "user";
    }
}