package com.eric.site.web.controller;

import com.eric.site.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
@Controller
@RequestMapping(value = {"/", "/index"})
public class IndexController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        log.info("to index page");
        model.addAttribute("index", "index");
        return "index";
    }
}