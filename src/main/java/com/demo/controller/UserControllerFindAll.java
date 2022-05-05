package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther:lyy
 * @Date:2022/4/29 - 04 - 29 - 16:19
 * @Desctiption:com.demo.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("userControllerFindAll")
public class UserControllerFindAll {

    private final UserService userService;

    public UserControllerFindAll(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/testFindAll")
    public ModelAndView testFindAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<User> users = userService.testFindAll();
        modelAndView.addObject("users",users);
        modelAndView.setViewName("findAll");
        return modelAndView;
    }
}
