package org.justYoung.shop.controller;

import org.justYoung.shop.model.User;
import org.justYoung.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String list(){
        return "user/list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "user/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(User user){
        userService.add(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/{id}/show")
    public String show(@PathVariable int id, Model model){
        User user = userService.load(id);
        model.addAttribute("show",user);
        return "user/show";
    }
    //登录功能
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login(){
        return "user/login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name,String password,Model model){
        User user = userService.login(name,password);
        if(user!=null){
            model.addAttribute("curUser",user);
            return "user/list";
        }
        String MSG="用户名或密码错误";
        model.addAttribute("msg",MSG);
        return "user/login";
    }
    //注册
    @RequestMapping(value = "/regist" ,method = RequestMethod.GET)
    public String regist(){
        return "user/regist";
    }
    @RequestMapping(value = "/regist" ,method = RequestMethod.POST)
    public String regist(User user,String repassword ,Model model){
        boolean isFlag = userService.checkByUname(user.getUsername());
        if(isFlag){
            String mes="此用户名已存在,请重新输入";
            model.addAttribute("mess",mes);
            return "user/regist";
        }
        if(user.getPassword().equals(repassword)) {
            userService.add(user);
            return "user/login";
        }
        String message="两次输入的密码不一致,请重新输入";
        model.addAttribute("msg",message);
        return "user/regist";



    }
}
