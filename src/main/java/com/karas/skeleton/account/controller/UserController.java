package com.karas.skeleton.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DESCRIPTION DEMO Controller
 * @AUTHOR karas - 272256055@qq.com
 * @DATE 2016/10/28
 */
@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        return "index";
    }


}
