package com.gouzhong1223.mall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 10:48 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.pojo
 * @ProjectName : mall
 * @Version : ${VERSION}
 */
@ApiModel(value = "com-gouzhong1223-mall-pojo-PmsProduct")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsProduct implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long brandId;

    @ApiModelProperty(value = "")
    private Long productCategoryId;

    @ApiModelProperty(value = "")
    private Long feightTemplateId;

    @ApiModelProperty(value = "")
    private Long productAttributeCategoryId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String pic;

    /**
     * 货号
     */
    @ApiModelProperty(value = "货号")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @ApiModelProperty(value = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 销量
     */
    @ApiModelProperty(value = "销量")
    private Integer sale;

    @ApiModelProperty(value = "")
    private BigDecimal price;

    /**
     * 促销价格
     */
    @ApiModelProperty(value = "促销价格")
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    @ApiModelProperty(value = "赠送的成长值")
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    @ApiModelProperty(value = "赠送的积分")
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    @ApiModelProperty(value = "限制使用的积分数")
    private Integer usePointLimit;

    /**
     * 副标题
     */
    @ApiModelProperty(value = "副标题")
    private String subTitle;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述")
    private String description;

    /**
     * 市场价
     */
    @ApiModelProperty(value = "市场价")
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    @ApiModelProperty(value = "库存")
    private Integer stock;

    /**
     * 库存预警值
     */
    @ApiModelProperty(value = "库存预警值")
    private Integer lowStock;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @ApiModelProperty(value = "商品重量，默认为克")
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    @ApiModelProperty(value = "")
    private String keywords;

    @ApiModelProperty(value = "")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    @ApiModelProperty(value = "")
    private String detailTitle;

    @ApiModelProperty(value = "")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @ApiModelProperty(value = "产品详情网页内容")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @ApiModelProperty(value = "移动端网页详情")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @ApiModelProperty(value = "促销开始时间")
    private LocalDateTime promotionStartTime;

    /**
     * 促销结束时间
     */
    @ApiModelProperty(value = "促销结束时间")
    private LocalDateTime promotionEndTime;

    /**
     * 活动限购数量
     */
    @ApiModelProperty(value = "活动限购数量")
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    /**
     * 品牌名称
     */
    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    /**
     * 商品分类名称
     */
    @ApiModelProperty(value = "商品分类名称")
    private String productCategoryName;

    private static final long serialVersionUID = 1L;
}