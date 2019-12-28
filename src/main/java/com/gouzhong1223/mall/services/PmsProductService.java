package com.gouzhong1223.mall.services;

import com.gouzhong1223.mall.pojo.PmsProduct;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-07 7:57 PM
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : mall
 */
public interface PmsProductService {


    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertOrUpdate(PmsProduct record);

    int insertOrUpdateSelective(PmsProduct record);

    int insertSelective(PmsProduct record);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    int updateBatch(List<PmsProduct> list);

    int batchInsert(List<PmsProduct> list);

}
