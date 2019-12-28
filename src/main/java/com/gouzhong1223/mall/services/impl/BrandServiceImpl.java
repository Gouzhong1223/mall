package com.gouzhong1223.mall.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gouzhong1223.mall.common.PageResult;
import com.gouzhong1223.mall.mapper.PmsBrandMapper;
import com.gouzhong1223.mall.pojo.PmsBrand;
import com.gouzhong1223.mall.req.PmsBrandParam;
import com.gouzhong1223.mall.services.BrandService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    @Autowired
    private PmsBrandMapper brandMapper;


    @Override
    public int createBrand(PmsBrandParam pmsBrandParam) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        //如果创建时首字母为空，取名称的第一个为首字母
        if (StringUtils.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        return brandMapper.insertSelective(pmsBrand);
    }

    @Override
    public List<PmsBrand> findBrandByName(String name) {
        List<PmsBrand> brandListByName = this.brandMapper.selectByName(name);
        return brandListByName;
    }

    @Override
    public int deleteBrandById(Long id) {
        int count = 0;
        try {
            count = this.brandMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public int updateBrand(PmsBrandParam pmsBrandParam, Long id) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        pmsBrand.setId(id);
        //如果创建时首字母为空，取名称的第一个为首字母
        if (StringUtils.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        int count = brandMapper.updateByPrimaryKeySelective(pmsBrand);
        if (count > 0) {
            return count;
        }
        return 0;
    }

    @Override
    public PageResult<PmsBrand> findBrandByList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<PmsBrand> pmsBrandParams = this.brandMapper.selectAllBrand();
        PageInfo<PmsBrand> pmsBrandPageInfo = new PageInfo<>(pmsBrandParams);
        return new PageResult<>(pmsBrandPageInfo.getPageNum(), pmsBrandPageInfo.getPageSize(), pmsBrandPageInfo.getTotal(), pmsBrandPageInfo.getPages(), pmsBrandPageInfo.getList());
    }

    @Override
    public List findAllBrand() {
        List<PmsBrand> brandList = this.brandMapper.selectAllBrand();
        return brandList;
    }

    @Override
    public PmsBrand findBrandById(Long id) {
        PmsBrand brand = this.brandMapper.selectByPrimaryKey(id);
        return brand;
    }

    @Override
    public int updateFactoryStatus(Long id, Integer factoryStatus) {
        int updatecount = this.brandMapper.updateFactoryStatus(id, factoryStatus);
        if (updatecount > 0) {
            return updatecount;
        }
        return 0;
    }

    @Override
    public int updateShowStatus(Long id, Integer showStatus) {
        int updatecount = this.brandMapper.updateShowStatus(id, showStatus);
        if (updatecount > 0) {
            return updatecount;
        }
        return 0;
    }
}
