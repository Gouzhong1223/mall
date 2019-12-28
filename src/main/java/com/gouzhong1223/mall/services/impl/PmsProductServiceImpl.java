package com.gouzhong1223.mall.services.impl;

import com.gouzhong1223.mall.pojo.PmsProduct;
import com.gouzhong1223.mall.services.PmsProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 11:04 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.services.impl
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(PmsProduct record) {
        return 0;
    }

    @Override
    public int insertOrUpdate(PmsProduct record) {
        return 0;
    }

    @Override
    public int insertOrUpdateSelective(PmsProduct record) {
        return 0;
    }

    @Override
    public int insertSelective(PmsProduct record) {
        return 0;
    }

    @Override
    public PmsProduct selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(PmsProduct record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(PmsProduct record) {
        return 0;
    }

    @Override
    public int updateBatch(List<PmsProduct> list) {
        return 0;
    }

    @Override
    public int batchInsert(List<PmsProduct> list) {
        return 0;
    }
}
