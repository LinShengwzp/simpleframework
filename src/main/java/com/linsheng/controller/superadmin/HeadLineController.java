package com.linsheng.controller.superadmin;

import com.linsheng.dto.Result;
import com.linsheng.entity.HeadLine;
import com.linsheng.service.solo.HeadLineService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeadLineController {
    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        // TODO 获取数据， 解析数据
        return headLineService.addHeadLine(new HeadLine());
    }

    public Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        return headLineService.removeHeadLine(1);
    }

    public Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        return headLineService.modifyHeadLine(new HeadLine());
    }

    public Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse resp) {
        return headLineService.queryHeadLineById(1);
    }

    public Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse resp) {
        return headLineService.queryHeadLine(new HeadLine(), 0, 1);
    }

}
