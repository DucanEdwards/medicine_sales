package com.wsz.medicine.exception;

public enum BusinessExceptionCode {
    OPR_LOGIN_ID_NOTEXIST("操作员ID不存在"),
    OPR_LOGIN_FAIL("用户名或密码不正确"),
    ;

    private String desc;

    BusinessExceptionCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
