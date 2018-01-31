package com.eric.site.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
@Controller
@RequestMapping(value = {"/", "/index"})
public class IndexController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("index", "index");
        return "index";
    }

}