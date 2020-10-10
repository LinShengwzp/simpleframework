package com.linsheng.service.solo;

import com.linsheng.dto.Result;
import com.linsheng.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    Result<Boolean> removeShopCategory(int shopCategoryId);
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);
    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, int pageIndex, int pageSize);
}
