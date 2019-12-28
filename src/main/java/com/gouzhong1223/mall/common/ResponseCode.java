package com.gouzhong1223.mall.common;

import lombok.Getter;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 2:42 PM
 * @email : 1162864960@qq.com
 */
@Getter
public enum ResponseCode {

    SUCCESS(200,"操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAIL(404,"参数校验失败")
    ;

    private Integer code;
    private String message;

    ResponseCode(Integer code) {
        this.code = code;
    }

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
