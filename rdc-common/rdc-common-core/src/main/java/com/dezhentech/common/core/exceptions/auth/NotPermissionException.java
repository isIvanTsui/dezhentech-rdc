package com.dezhentech.common.core.exceptions.auth;

/**
 * 未能通过的权限认证异常
 *
 * @author ruoyi
 */
public class NotPermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotPermissionException(String permission) {
        super(permission);
    }

    public NotPermissionException(String[] permissions) {
        //TODO
//        super(StringUtils.join(permissions, ","));
    }
}
