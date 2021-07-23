package com.vueblog.mapper;

import com.vueblog.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vueblog.entity.UserDTO;
import com.vueblog.entity.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@Repository
@Component
public interface UserMapper extends BaseMapper<User> {
    UserVO getUser(@Param("UserDTO")UserDTO userDTO);//不知道为什么行不通，会提示参数里没有getter方法
    UserVO getAll(@Param("UserDTO") UserDTO userDTO);
    UserDTO selectOne();
}
