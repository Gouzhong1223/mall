package com.gouzhong1223.mall.dto;

import com.gouzhong1223.mall.common.ResponseCode;
import lombok.Data;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 2:47 PM
 * @email : 1162864960@qq.com
 */
@Data
public class ResponseDto<T> {

    private Integer code;
    private String message;
    private T data;

    public static <T> ResponseDto<T> SUCCESS(T data) {
        return new ResponseDto<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), data);
    }

    public static <T> ResponseDto<T> SUCCESS(String message, T data) {
        return new ResponseDto<T>(ResponseCode.SUCCESS.getCode(), message, data);
    }

    public static <T> ResponseDto<T> SUCCESS(Integer code, String message, T data) {
        return new ResponseDto<T>(code, message, data);
    }

    public static <T> ResponseDto<T> FAIL(T data) {
        return new ResponseDto<T>(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMessage(), data);
    }

    public static <T> ResponseDto<T> FAIL(String message, T data) {
        return new ResponseDto<T>(ResponseCode.FAILED.getCode(), message, data);
    }

    public static <T> ResponseDto<T> FAIL(Integer code, String message, T data) {
        return new ResponseDto<T>(code, message, data);
    }

    public static <T> ResponseDto<T> VALUE_FAIL(T data) {
        return new ResponseDto<T>(ResponseCode.VALIDATE_FAIL.getCode(), ResponseCode.VALIDATE_FAIL.getMessage(), data);
    }

    public static <T> ResponseDto<T> VALUE_FAIL(String message, T data) {
        return new ResponseDto<T>(ResponseCode.VALIDATE_FAIL.getCode(), message, data);
    }

    public static <T> ResponseDto<T> VALUE_FAIL(Integer code, String message, T data) {
        return new ResponseDto<T>(code, message, data);
    }

    public static <T> ResponseDto<T> FAIL() {
        return new ResponseDto<T>(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getMessage(), null);
    }


    public ResponseDto(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
