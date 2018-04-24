package com.eric.site.web.controller.admin;

import com.eric.site.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Eric
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        log.debug("this is a debug log");
        log.info("this is a info log");
        log.warn("this is a warn log");
        log.error("this is a error log");
        model.addAttribute("index", "admin");
        return "/admin/index";
    }
}