package com.gouzhong1223.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gouzhong1223.mall.pojo.PmsBrand;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 10:48 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.mapper
 * @ProjectName : mall
 * @Version : ${VERSION}
 */
public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    int insertSelective(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsBrand record);

    int updateByPrimaryKey(PmsBrand record);

    PmsBrand selectOneByName(@Param("name") String name);

    List<PmsBrand> selectByName(@Param("name") String name);

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