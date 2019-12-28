package com.gouzhong1223.mall.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : TODO
 * @Date : create by QingSong in 2019-12-28 10:47 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.mall.pojo
 * @ProjectName : mall
 * @Version : 1.0.0
 */
@ApiModel(value = "com-gouzhong1223-mall-pojo-CmsHelp")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsHelp implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long categoryId;

    @ApiModelProperty(value = "")
    private String icon;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private Integer showStatus;

    @ApiModelProperty(value = "")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "")
    private Integer readCount;

    @ApiModelProperty(value = "")
    private String content;

    private static final long serialVersionUID = 1L;
}