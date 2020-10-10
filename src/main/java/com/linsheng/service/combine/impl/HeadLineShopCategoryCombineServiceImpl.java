package com.linsheng.service.combine.impl;

import com.linsheng.dto.MainPageInfoDto;
import com.linsheng.dto.Result;
import com.linsheng.entity.HeadLine;
import com.linsheng.entity.ShopCategory;
import com.linsheng.service.combine.HeadLineShopCategoryCombineService;
import com.linsheng.service.solo.HeadLineService;
import com.linsheng.service.solo.ShopCategoryService;

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;

    private ShopCategoryService shopCategoryService;

    @Override
    public Result<MainPageInfoDto> getMainPageInfo() {
        // 1 查询前四条头条列表
        // 2 查询前100条店铺信息
        // 3 合并返回
        return Result.success(
                new MainPageInfoDto(
                        headLineService.queryHeadLine(new HeadLine().setEnableStatus(1), 1, 5).getData(),
                        shopCategoryService.queryShopCategory(new ShopCategory(), 1, 100).getData()
                )
        );
    }
}
