package com.gouzhong1223.mall.services.impl;

import com.gouzhong1223.mall.pojo.OmsOrder;
import com.gouzhong1223.mall.services.OmsOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

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
public class OmsOrderServiceImpl implements OmsOrderService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(OmsOrder record) {
        return 0;
    }

    @Override
    public int insertOrUpdate(OmsOrder record) {
        return 0;
    }

    @Override
    public int insertOrUpdateSelective(OmsOrder record) {
        return 0;
    }

    @Override
    public int insertSelective(OmsOrder record) {
        return 0;
    }

    @Override
    public OmsOrder selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(OmsOrder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(OmsOrder record) {
        return 0;
    }

    @Override
    public int updateBatch(List<OmsOrder> list) {
        return 0;
    }

    @Override
    public int batchInsert(List<OmsOrder> list) {
        return 0;
    }
}
