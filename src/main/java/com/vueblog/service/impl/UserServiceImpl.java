package com.vueblog.service.impl;

import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.User;
import com.vueblog.entity.UserDTO;
import com.vueblog.entity.UserVO;
import com.vueblog.mapper.UserMapper;
import com.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public ResultVO getUser(UserDTO userDTO) {
        UserVO userVO = userMapper.getAll(userDTO);
        System.out.println(userVO);
        if( userDTO.getUsername().equals( userVO.getUsername() ) && userDTO.getPassword().equals( userVO.getPassword() ))
            return new ResultVO(userVO);
        else
            return ResultVO.FAIL;
    }

    @Override
    public ResultVO getAll(UserDTO userDTO) {
        UserVO userVO = userMapper.getAll(userDTO);
        if(userVO != null)
            return new ResultVO(userVO);
        else
            return ResultVO.FAIL;
    }

    @Override
    public ResultVO selectOne() {
        UserDTO user = userMapper.selectOne();
        return new ResultVO(user);
    }
}
