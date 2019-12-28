package com.gouzhong1223.mall.services;

import com.gouzhong1223.mall.common.PageResult;
import com.gouzhong1223.mall.pojo.PmsBrand;
import com.gouzhong1223.mall.req.PmsBrandParam;


import java.util.List;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description :
 * @date : create by QingSong in 2019-11-15 3:28 PM
 * @email : 1162864960@qq.com
 */
public interface BrandService {
    /**
     * 新增品牌
     *
     * @param brand
     * @return
     */
    int createBrand(PmsBrandParam brand);

    /**
     * 根据品牌名称查询品牌详情
     *
     * @param name
     * @return
     */
    List<PmsBrand> findBrandByName(String name);

    /**
     * 根据id删除品牌
     *
     * @param id
     * @return
     */
    int deleteBrandById(Long id);

    /**
     * 更新品牌
     *
     * @param brand
     * @return
     */
    int updateBrand(PmsBrandParam brand, Long id);

    /**
     * 分页查询品牌
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult<PmsBrand> findBrandByList(Integer pageNum, Integer pageSize);

    /**
     * 查询所有的品牌
     *
     * @return
     */
    List findAllBrand();

    /**
     * 根据id查询品牌
     *
     * @param id
     * @return
     */
    PmsBrand findBrandById(Long id);

    /**
     * 更改厂家模式
     *
     * @param id
     * @param factoryStatus
     * @return
     */
    int updateFactoryStatus(Long id, Integer factoryStatus);

    /**
     * 更改显示模式
     *
     * @param id
     * @param showStatus
     * @return
     */
    int updateShowStatus(Long id, Integer showStatus);
}
