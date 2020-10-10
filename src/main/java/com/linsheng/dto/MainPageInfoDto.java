package com.linsheng.dto;

import com.linsheng.entity.HeadLine;
import com.linsheng.entity.ShopCategory;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 主页信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MainPageInfoDto {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
