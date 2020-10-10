package com.linsheng.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 返回的结果集
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -4986884223935683019L;
    private int code; // 结果状态码, 200表示成功
    private String msg; // 结果详情
    private T data; // 结果集

    public static int successCode = 200;
    public static String successMsg = "Success";

    /**
     * 获取数据集成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result success(T data) {
        return new Result(successCode, successMsg, data);
    }

}
