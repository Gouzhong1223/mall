package com.gouzhong1223.mall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 10:49 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.pojo
 * @ProjectName : mall
 * @Version : ${VERSION}
 */
@ApiModel(value = "com-gouzhong1223-mall-pojo-PmsSkuStock")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsSkuStock implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long productId;

    /**
     * sku编码
     */
    @ApiModelProperty(value = "sku编码")
    private String skuCode;

    @ApiModelProperty(value = "")
    private BigDecimal price;

    /**
     * 库存
     */
    @ApiModelProperty(value = "库存")
    private Integer stock;

    /**
     * 预警库存
     */
    @ApiModelProperty(value = "预警库存")
    private Integer lowStock;

    /**
     * 销售属性1
     */
    @ApiModelProperty(value = "销售属性1")
    private String sp1;

    @ApiModelProperty(value = "")
    private String sp2;

    @ApiModelProperty(value = "")
    private String sp3;

    /**
     * 展示图片
     */
    @ApiModelProperty(value = "展示图片")
    private String pic;

    /**
     * 销量
     */
    @ApiModelProperty(value = "销量")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @ApiModelProperty(value = "单品促销价格")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @ApiModelProperty(value = "锁定库存")
    private Integer lockStock;

    private static final long serialVersionUID = 1L;

    public static PmsSkuStockBuilder builder() {
        return new PmsSkuStockBuilder();
    }
}