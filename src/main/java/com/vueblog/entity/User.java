package com.vueblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * <p>
 *
 * </p>
 *
 * @author 张雷
 * @since 2021-06-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
//@Table(name = "m_user")
@TableName("m_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "用户名不能为空")
    @Column(name = "username")
//    @Column(name = "avatar")
    private String username;

    @Column(name = "avatar")
    private String avatar;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "密码不能为空")
    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private Integer status;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "lastLogin")
    private LocalDateTime lastLogin;


}
