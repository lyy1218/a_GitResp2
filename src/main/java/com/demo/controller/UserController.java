package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther:lyy
 * @Date:2022/4/25 - 04 - 25 - 15:48
 * @Desctiption:com.demo.controller
 * @Version:1.0
 */

@Controller
@RequestMapping("usercontroller")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //    登录
    @RequestMapping("testLogin")
    public ModelAndView testLogin(String name, String password) {
        User user = userService.testLogin(name, password);
        System.out.println(user);
        System.out.println(name);
        System.out.println(password);
        ModelAndView modelAndView=new ModelAndView();
        if (user != null) {
            modelAndView.setViewName("success");
        } else {
            modelAndView.setViewName("error");
        }
        return modelAndView;

    }

    //        注册
    @RequestMapping("/testRegist")
    public ModelAndView testRegist(String name,String password) {
        int a=userService.testRegist(name, password);
        System.out.println(name);
        System.out.println(password);
        System.out.println(a);
        ModelAndView modelAndView=new ModelAndView();
        if (a != 0) {
            modelAndView.setViewName("registSuccess");
            return modelAndView;
        }else {
            modelAndView.setViewName("registError");
            return modelAndView;
        }
    }

}
