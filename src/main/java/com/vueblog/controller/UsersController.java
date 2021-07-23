package com.vueblog.controller;

import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.User;
import com.vueblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@RestController
@RequestMapping("/user")
public class UsersController {
//    @Autowired
//    UserService userService;

//    @GetMapping("/index")
//    public Object index(){
//        return ResultVO.SUCCESS;
//    }

    @GetMapping("/index")
    public Object index(){
    return ResultVO.SUCCESS;
}
    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return new ResultVO(user);
    }

}
