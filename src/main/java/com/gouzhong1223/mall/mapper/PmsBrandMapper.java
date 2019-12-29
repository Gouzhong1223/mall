package com.gouzhong1223.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gouzhong1223.mall.pojo.PmsBrand;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : PmsBrandMapper
 * @Date : create by QingSong in 2019-12-28 10:48 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.mapper
 * @ProjectName : mall
 * @Version : 1.0.0
 */
public interface PmsBrandMapper {

    /**
     * 根据主键删除brand
     *
     * @param id 需要删除的brand主键
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增brand
     *
     * @param record brand对象
     * @return
     */
    int insert(PmsBrand record);

    /**
     * 新增brand
     *
     * @param record brand对象
     * @return
     */
    int insertSelective(PmsBrand record);

    /**
     * 根据主键查询brand
     *
     * @param id brand主键
     * @return
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     * 根据主键更新brand
     *
     * @param record brand对象
     * @return
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     * 根据主键更新brand
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(PmsBrand record);

    /**
     * 根据brand-name查询一个brand
     *
     * @param name brand名字
     * @return
     */
    PmsBrand selectOneByName(@Param("name") String name);

    /**
     * 根据brand-name查询多个Brand
     *
     * @param name
     * @return
     */
    List<PmsBrand> selectByName(@Param("name") String name);

    /**
     * 查询所有Brand
     *
     * @return
     */
    @Select("select * from mall.pms_brand")
    List<PmsBrand> selectAllBrand();

    /**
     * 更改厂家模式
     *
     * @param id            品牌id
     * @param factoryStatus 1为显示 0为不显示
     * @return
     */
    @Update("update pms_brand set factory_status = #{factoryStatus} where id = #{id}")
    int updateFactoryStatus(Long id, Integer factoryStatus);

    /**
     * 更改显示模式
     *
     * @param id         品牌id
     * @param showStatus 1为显示 0为不显示
     * @return
     */
    @Update("update pms_brand set show_status = #{showStatus} where id = #{id}")
    int updateShowStatus(Long id, Integer showStatus);
}