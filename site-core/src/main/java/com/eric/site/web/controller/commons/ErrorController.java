package com.eric.site.web.controller.commons;

import com.eric.site.web.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Eric
 */
@Controller
@RequestMapping("/error")
public class ErrorController extends BaseController {

    @RequestMapping("/defaultError")
    public String defaultError() {
        return "/error/defaultError";
    }
}
