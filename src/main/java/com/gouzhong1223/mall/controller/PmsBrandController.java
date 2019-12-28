package com.gouzhong1223.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gouzhong1223.mall.common.PageResult;
import com.gouzhong1223.mall.dto.ResponseDto;
import com.gouzhong1223.mall.pojo.PmsBrand;
import com.gouzhong1223.mall.req.PmsBrandParam;
import com.gouzhong1223.mall.services.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Gouzhong
 * @company : www.gouzhong1223.com
 * @Description : 商品管理Controller
 * @date : create by QingSong in 2019-11-15 3:21 PM
 * @email : 1162864960@qq.com
 */
@RestController
@RequestMapping("/brand")
@Api(tags = "BrandController", description = "商品品牌管理")
public class PmsBrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation(value = "新增品牌")
    @PostMapping("/create")
    public ResponseDto createBrand(@Validated @RequestBody PmsBrandParam brand,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseDto.VALUE_FAIL("参数不能为空", null);
        }
        int createbrand = this.brandService.createBrand(brand);
        if (createbrand != 0) {
            return ResponseDto.SUCCESS(createbrand);
        }
        return ResponseDto.FAIL("添加失败", null);
    }

    @ApiOperation(value = "根据品牌id查询品牌")
    @GetMapping("/{id}")
    public ResponseDto findBrandById(@PathVariable("id") Long id) {
        PmsBrand brand = this.brandService.findBrandById(id);
        if (brand != null) {
            return ResponseDto.SUCCESS(brand);
        }
        return ResponseDto.FAIL();
    }

    @ApiOperation(value = "根据品牌id删除品牌")
    @GetMapping("/delete/{id}")
    @ResponseBody
    public ResponseDto deleteBrand(@PathVariable("id") Long id) {
        int count = this.brandService.deleteBrandById(id);
        if (count != 0) {
            return ResponseDto.SUCCESS(count);
        }
        return ResponseDto.FAIL(null);
    }

    @ApiOperation(value = "更新品牌")
    @PostMapping("/update/{id}")
    @ResponseBody
    public ResponseDto updateBrand(@PathVariable("id") Long id,
                                   @Validated @RequestBody PmsBrandParam pmsBrandParam,
                                   BindingResult result) {
        if (result.hasErrors()) {
            return ResponseDto.VALUE_FAIL(null);
        }
        int count = this.brandService.updateBrand(pmsBrandParam, id);
        if (count != 0) {
            return ResponseDto.SUCCESS(count);
        }
        return ResponseDto.FAIL();
    }

    @ApiOperation(value = "根据名字查询品牌分页")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto findBrandsListByName(@RequestParam(value = "keyword", required = false) String keyword,
                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        if (keyword == null) {
            PageResult<PmsBrand> pageResult = this.brandService.findBrandByList(pageNum, pageSize);
            if (!CollectionUtils.isEmpty(pageResult.getList())) {
                return ResponseDto.SUCCESS(pageResult);
            }
        } else {
            List<PmsBrand> brandByName = this.brandService.findBrandByName(keyword);
            if (!CollectionUtils.isEmpty(brandByName)) {
                PageHelper.startPage(pageNum, pageSize);
                PageInfo<PmsBrand> pmsBrandPageInfo = new PageInfo<>(brandByName);
                return ResponseDto.SUCCESS(new PageResult<>(pmsBrandPageInfo.getPageNum(), pmsBrandPageInfo.getPageSize(), pmsBrandPageInfo.getTotal(), pmsBrandPageInfo.getPages(), pmsBrandPageInfo.getList()));
            }
        }
        return ResponseDto.FAIL("未查询到", null);
    }

    @ApiOperation(value = "更新厂家制造商状态")
    @RequestMapping(value = "/update/factoryStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto updateFactoryStatus(@RequestParam("ids") Long id,
                                           @RequestParam("factoryStatus") Integer factoryStatus) {
        int updatecount = this.brandService.updateFactoryStatus(id, factoryStatus);
        if (updatecount != 0) {
            return ResponseDto.SUCCESS(updatecount);
        }
        return ResponseDto.FAIL();
    }

    @ApiOperation(value = "更新显示状态")
    @RequestMapping(value = "/update/showStatus", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDto updateShowStatus(@RequestParam("ids") Long id,
                                        @RequestParam("showStatus") Integer showStatus) {
        int count = brandService.updateShowStatus(id, showStatus);
        if (count > 0) {
            return ResponseDto.SUCCESS(count);
        } else {
            return ResponseDto.FAIL();
        }
    }

}
