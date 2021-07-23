package com.vueblog.controller;

import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.UserDTO;
import com.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test(){
        return "Test";
    }
    @RequestMapping("/test1")
    public ResultVO test1(@Validated @RequestBody UserDTO userDTO){
        return userService.getAll(userDTO);
    }
    @RequestMapping("/test2")
    public ResultVO test2(){
        return userService.selectOne();
    }
}
