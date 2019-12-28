package com.gouzhong1223.mall.services;

import com.gouzhong1223.mall.pojo.OmsOrder;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-07 7:50 PM
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : mall
 */
public interface OmsOrderService {


    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertOrUpdate(OmsOrder record);

    int insertOrUpdateSelective(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    int updateBatch(List<OmsOrder> list);

    int batchInsert(List<OmsOrder> list);

}
