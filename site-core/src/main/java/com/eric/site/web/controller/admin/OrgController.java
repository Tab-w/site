package com.eric.site.web.controller.admin;

import com.eric.site.web.common.BaseController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Eric
 */
@RestController
@RequestMapping("/org")
public class OrgController extends BaseController {

    @RequestMapping
    public String index(Model model) {
        return "org";
    }
}