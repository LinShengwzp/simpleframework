package com.linsheng.controller.frontend;

import com.linsheng.dto.MainPageInfoDto;
import com.linsheng.dto.Result;
import com.linsheng.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainPageController {
    private HeadLineShopCategoryCombineService mainPageService;

    public Result<MainPageInfoDto> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp) {
        return mainPageService.getMainPageInfo();
    }

}
