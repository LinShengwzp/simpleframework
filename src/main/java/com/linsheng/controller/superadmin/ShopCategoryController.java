package com.linsheng.controller.superadmin;

import com.linsheng.dto.Result;
import com.linsheng.entity.ShopCategory;
import com.linsheng.service.solo.ShopCategoryService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopCategoryController {
    private ShopCategoryService shopCategoryService;


    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        // TODO 获取数据， 解析数据
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    public Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        return shopCategoryService.removeShopCategory(1);
    }

    public Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    public Result<ShopCategory> queryShopCategoryById(HttpServletRequest req, HttpServletResponse resp) {
        return shopCategoryService.queryShopCategoryById(1);
    }

    public Result<List<ShopCategory>> queryShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        return shopCategoryService.queryShopCategory(new ShopCategory(), 0, 1);
    }


}
