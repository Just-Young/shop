package org.justYoung.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/27.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex()
    {
        return "index";
    }

    @RequestMapping("/{page}")
    public String showpage(@PathVariable String page)
    {
        return page;
    }
}
