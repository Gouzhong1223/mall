package com.gouzhong1223.mall.services.impl;

import com.gouzhong1223.mall.pojo.PmsBrand;
import com.gouzhong1223.mall.services.PmsBrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 11:02 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.services.impl
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(PmsBrand record) {
        return 0;
    }

    @Override
    public int insertOrUpdate(PmsBrand record) {
        return 0;
    }

    @Override
    public int insertOrUpdateSelective(PmsBrand record) {
        return 0;
    }

    @Override
    public int insertSelective(PmsBrand record) {
        return 0;
    }

    @Override
    public PmsBrand selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(PmsBrand record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(PmsBrand record) {
        return 0;
    }

    @Override
    public int updateBatch(List<PmsBrand> list) {
        return 0;
    }

    @Override
    public int batchInsert(List<PmsBrand> list) {
        return 0;
    }
}
