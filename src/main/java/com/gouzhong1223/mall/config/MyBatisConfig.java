package com.gouzhong1223.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : MyBatis配置
 * @Date : create by QingSong in 2019-12-28 10:42 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.config
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.gouzhong1223.mall.mapper")
public class MyBatisConfig {
}
