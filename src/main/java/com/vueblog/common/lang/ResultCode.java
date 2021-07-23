package com.vueblog.common.lang;

public enum ResultCode {
        SUCCESS("1", "成功"),
        FAIL("0", "失败"),
        NULL("-1", "数据不存在"),
        EXCEPTION("-2", "系统异常"),
        FORBIDDEN("9403", "没有权限"),
        PARAM_INVALID("-3", "参数错误"),
        NO_CODE("-999", "返回错误码为空异常"),
        NO_MESSAGE("-998", "返回错误信息为空异常"),
        PARENT_ORG_IS_SELF("-997", "上级组织是自己"),
        PARENT_PARENT_ORG_IS_SELF("-996", "组织关系出现循环"),
        CAN_NOT_BE_DELETE("-995", "存在不能删除的数据，删除失败"),
        ID_SERVICENOT_EXCEPTION("-994", "ID服务异常"),
        ROOT_NOT_UNIQUE("-993", "已存在根组织"),
        ORG_INCORRECT("-887", "根组织关系选择有误"),
        ORG_CODE_NOT_UNIQUE("-992", "组织CODE不能重复"),
        POS_CODE_NOT_UNIQUE("-991", "岗位CODE不能重复"),
        ORG_CYCLIC_RELATION("-990", "组织关系出现循环"),
        EISXT_USER_ACCOUNT("-900", "账号已存在"),
        MUST_HAVE_ROOT("-889", "必须有一个根组织"),
        ROOT_CANT_DELETE("-888", "根组织不能删除"),
        EXIST_PMSN_CODE("-899", "权限编码已存在"),
        EXIST_PMSN_OUTER("-898", "外部路径已存在"),
        EXIST_ROLE_HAS_PMSN("-897", "有角色拥有该权限，删除失败"),
        EXIST_ROLE_CODE("-799", "角色编码已存在"),
        EXIST_USER_HAS_ROLE("-798", "有用户是该角色，删除失败"),
        EXIST_USER_HAS_PMSN("-797", "有用户已有该权限"),
        EXIST_DICT_GROUP_DATA("-699", "该组已存在"),
        EXIST_GROUP_DATA("-669", "该组已存在"),
        VERIFICATION_CODE_ERROR("-599", "验证码错误"),
        VERIFICATION_CODE_TIMEOUT("-598", "验证码超时"),
        ACCOUNT_PWD_ERROR("-597", "账号密码错误"),
        ACCOUNT_NOT_EXIST("-596", "账号不存在"),
        PASSWORD_IS_SAME("-595", "新密码与旧密码不能相同"),
        PASSWORD_IS_DIFFERENT("-594", "两次新密码设置不相同"),
        PASSWORD_FORMAT_INCORRECT("-593", "密码格式不正确"),
        OLDPASSWORD_IS_ERROR("-592", "旧密码错误"),
        ACCOUNT_LOCKED("-591", "账号已锁定"),
        ACCOUNT_OTHER("-590", "账号存在异常，请联系管理员");

        private String code;
        private String msg;

        private ResultCode(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String code() {
            return this.code;
        }

        public String msg() {
            return this.msg;
        }
}
