package com.linsheng.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ShopCategory implements Serializable {
    private static final long serialVersionUID = 30986091565485946L;
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority; // 优先级
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
