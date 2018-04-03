package com.eric.site.web.controller;

import com.eric.site.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Eric
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @RequestMapping("/view")
    public String loginView(String username, String passwqord) {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String login() {
        return "login";
    }
}
