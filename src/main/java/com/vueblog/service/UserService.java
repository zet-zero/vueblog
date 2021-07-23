package com.vueblog.service;

import com.vueblog.common.lang.ResultVO;
import com.vueblog.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.vueblog.entity.UserDTO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
public interface UserService extends IService<User> {
    ResultVO getUser(UserDTO userDTO);
    ResultVO getAll(UserDTO userDTO);
    ResultVO selectOne();

}
