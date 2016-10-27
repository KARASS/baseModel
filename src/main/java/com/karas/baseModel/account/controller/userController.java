package com.karas.baseModel.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by karasying on 2016/10/27.
 */

@Controller
public class userController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        return "index";
    }

    @RequestMapping("/error")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }


}
