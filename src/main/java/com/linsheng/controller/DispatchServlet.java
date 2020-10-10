package com.linsheng.controller;

import com.linsheng.controller.frontend.MainPageController;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * 参考 spring MVC ，仅通过 DispatchServlet 进行请求分发
 * <p>
 * 1 拦截所有请求
 * 2 解析请求
 * 3 派发给对应的 Controller 进行请求处理
 */
@Slf4j
@WebServlet("/") // 1 拦截（几乎）所有请求： ‘/’ 与 ‘/*’ 的区别 ： ‘/’会拦截所有的非 jsp请求，而‘/*’包括jsp请求
public class DispatchServlet extends HttpServlet {
    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.service(req, resp);
        // 2 解析请求
        String method = req.getMethod();
        String servletPath = req.getServletPath();
        log.info(MessageFormat.format("Method:{0} Path:{1}", method, servletPath));

        // 3 派发给对应的 Controller 进行请求处理
        switch (method) {
            case "GET": {
                switch (servletPath) {
                    case "/frontend/getmainpageinfo":
                        new MainPageController().getMainPageInfo(req, resp);
                        break;
                }
            }
            break;
            case "POST": {

            }
            break;
        }
    }
}
