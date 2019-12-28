package com.gouzhong1223.mall.controller;

import com.gouzhong1223.mall.dto.ResponseDto;

import com.gouzhong1223.mall.req.UmsAdminLoginParam;
import com.gouzhong1223.mall.services.LoginService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 2:46 PM
 * @email : 1162864960@qq.com
 */
@RestController
@RequestMapping("/admin")
public class UmsAdminController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseDto login(@Validated @RequestBody UmsAdminLoginParam user, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseDto.VALUE_FAIL(null);
        }
        if (this.loginService.login(user)) {
            HashMap map = new HashMap();
            map.put("tokenHead", "abc");
            map.put("token", "abcd123");
            return ResponseDto.SUCCESS(map);
        }
        return ResponseDto.FAIL();
    }

    @GetMapping("/info")
    public ResponseDto getAdminInfo(Principal principal) {
        Map<String, Object> data = new HashMap<>();
        data.put("username", "zhangsan");
        List<String> list = new ArrayList<>(3);
        list.add("TEST");
        list.add("ADMIN");
        data.put("roles", list);
        data.put("icon", "https://www.baidu.com/img/bd_logo1.png");
        return ResponseDto.SUCCESS(data);
    }
}
