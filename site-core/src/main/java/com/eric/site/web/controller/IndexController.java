package com.eric.site.web.controller;

import com.eric.site.core.utils.SnowflakeIdWorker;
import com.eric.site.web.base.BaseController;
import com.eric.site.web.entity.User;
import com.eric.site.web.service.Impl.UserServiceImpl;
import com.eric.site.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Eric
 */
@Controller
@RequestMapping(value = {"/", "/index"})
public class IndexController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        log.debug("this is a debug log");
        log.info("this is a info log");
        log.warn("this is a warn log");
        log.error("this is a error log");
        model.addAttribute("index", "index");
        return "index";
    }
}