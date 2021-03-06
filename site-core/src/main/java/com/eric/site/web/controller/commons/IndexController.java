package com.eric.site.web.controller.commons;

import com.eric.site.web.common.BaseController;
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