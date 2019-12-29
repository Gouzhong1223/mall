package com.gouzhong1223.mall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : Brand实体类
 * @Date : create by QingSong in 2019-12-28 10:48 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.pojo
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@ApiModel(value = "com-gouzhong1223-mall-pojo-PmsBrand")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsBrand implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private String name;

    /**
     * 首字母
     */
    @ApiModelProperty(value = "首字母")
    private String firstLetter;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    /**
     * 是否显示
     */
    @ApiModelProperty(value = "是否显示")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @ApiModelProperty(value = "产品数量")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @ApiModelProperty(value = "产品评论数量")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @ApiModelProperty(value = "品牌logo")
    private String logo;

    /**
     * 专区大图
     */
    @ApiModelProperty(value = "专区大图")
    private String bigPic;

    /**
     * 品牌故事
     */
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;

    private static final long serialVersionUID = 1L;
}