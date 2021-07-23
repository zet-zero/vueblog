package com.vueblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.net.httpserver.Authenticator.Success;
import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.User;
import com.vueblog.entity.UserDTO;
import com.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public ResultVO login(@Validated @RequestBody UserDTO userDTO){
        System.out.println("test");
        if(userDTO != null)
        {
            System.out.println(userDTO);
            return userService.getUser(userDTO);
        }
        else
            return ResultVO.FAIL;
    }
}
