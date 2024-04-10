package com.heroxin.common.core.domain.model;

import lombok.Data;

/**
 * @Author lixin
 * @Create 2024-04-10-09:44
 * @ClassName LoginBody
 * @Description:
 */
@Data
public class LoginBody {
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid;
}
