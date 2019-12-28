package com.gouzhong1223.mall.services;

import com.gouzhong1223.mall.pojo.PmsBrand;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-07 7:51 PM
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : mall
 */
public interface PmsBrandService {


    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertOrUpdate(PmsBrand record);

    int insertOrUpdateSelective(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    int updateBatch(List<PmsBrand> list);

    int batchInsert(List<PmsBrand> list);

}
