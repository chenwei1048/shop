package com.zheng.shop.controller;

import com.zheng.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping()
    public String list(Model model){
        model.addAttribute("list",userService.list());
        return "user";
    }

}
