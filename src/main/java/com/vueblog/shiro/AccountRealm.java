//package com.vueblog.shiro;
//
//import cn.hutool.core.bean.BeanUtil;
//import com.vueblog.entity.User;
//import com.vueblog.service.UserService;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AccountRealm extends AuthorizingRealm {
////    @Autowired
////    JwtUtils jwtUtils;
//    @Autowired
//    UserService userService;
////    @Override
////    public boolean supports(AuthenticationToken token) {
////        return token instanceof JwtToken;
////    }
//    //权限校验
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        return null;
//    }
//    //登录认证校验
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
////        JwtToken jwt = (JwtToken) token;
////        log.info("jwt----------------->{}", jwt);
////        String userId = jwtUtils.getClaimByToken((String) jwt.getPrincipal()).getSubject();
////        User user = userService.getById(Long.parseLong(userId));
////        if(user == null) {
////            throw new UnknownAccountException("账户不存在！");
////        }
////        if(user.getStatus() == -1) {
////            throw new LockedAccountException("账户已被锁定！");
////        }
////        AccountProfile profile = new AccountProfile();
////        BeanUtil.copyProperties(user, profile);
////        log.info("profile----------------->{}", profile.toString());
////        return new SimpleAuthenticationInfo(profile, jwt.getCredentials(), getName());
//        return null;
//    }
//}
