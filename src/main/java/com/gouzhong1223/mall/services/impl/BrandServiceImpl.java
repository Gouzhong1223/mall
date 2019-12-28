package com.gouzhong1223.mall.services.impl;

import com.gouzhong1223.mall.common.PageResult;
import com.gouzhong1223.mall.pojo.PmsBrand;
import com.gouzhong1223.mall.req.PmsBrandParam;
import com.gouzhong1223.mall.services.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 11:00 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.services.impl
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Override
    public int createBrand(PmsBrandParam brand) {
        return 0;
    }

    @Override
    public List<PmsBrand> findBrandByName(String name) {
        return null;
    }

    @Override
    public int deleteBrandById(Long id) {
        return 0;
    }

    @Override
    public int updateBrand(PmsBrandParam brand, Long id) {
        return 0;
    }

    @Override
    public PageResult<PmsBrand> findBrandByList(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public List findAllBrand() {
        return null;
    }

    @Override
    public PmsBrand findBrandById(Long id) {
        return null;
    }

    @Override
    public int updateFactoryStatus(Long id, Integer factoryStatus) {
        return 0;
    }

    @Override
    public int updateShowStatus(Long id, Integer showStatus) {
        return 0;
    }
}
