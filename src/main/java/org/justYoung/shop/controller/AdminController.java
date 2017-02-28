package org.justYoung.shop.controller;

import org.justYoung.shop.model.Admin;
import org.justYoung.shop.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/2/27.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value ="/{id}/show",method = RequestMethod.GET)
    public String load(@PathVariable int id, Model model){
        Admin admin = adminService.load(id);
        model.addAttribute(admin);
        return "admin/list";
    }
}
