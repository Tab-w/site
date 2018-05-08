package com.eric.site.web.common;

import com.eric.site.web.utils.DateEditor;
import com.eric.site.web.utils.DoubleEditor;
import com.eric.site.web.utils.FloatEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Author: Eric
 */
@Controller
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpSession session;

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor("yyyy-MM-dd", true));
        binder.registerCustomEditor(Float.class, new FloatEditor());
        binder.registerCustomEditor(Double.class, new DoubleEditor());
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e) {
        // 异常后的操作。。。。。。
        log.error(e.getMessage());
        return "/error/defaultError";
    }
}