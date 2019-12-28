package com.gouzhong1223.mall.services.impl;

import com.gouzhong1223.mall.mapper.UserMapper;
import com.gouzhong1223.mall.req.UmsAdminLoginParam;
import com.gouzhong1223.mall.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 11:01 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.services.impl
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(UmsAdminLoginParam user) {
        UmsAdminLoginParam selectOne = this.userMapper.selectUserByUsername(user.getUsername());
        if (selectOne.getPassword().equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
