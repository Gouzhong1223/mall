package com.gouzhong1223.mall.mapper;

import com.gouzhong1223.mall.req.UmsAdminLoginParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 3:04 PM
 * @email : 1162864960@qq.com
 */
@Mapper
public interface UserMapper {
    @Select("select * from ums_admin where username = #{username}")
    UmsAdminLoginParam selectUserByUsername(String username);
}
