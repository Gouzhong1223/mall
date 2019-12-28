package com.gouzhong1223.mall.services;

import com.gouzhong1223.mall.req.UmsAdminLoginParam;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 2:58 PM
 * @email : 1162864960@qq.com
 */
public interface LoginService {
    boolean login(UmsAdminLoginParam user);
}
