package com.demo.factory.method;

import com.demo.factory.entity.Mouse;

/**
 * 工厂方法模式： 对简单工厂的进一步抽象和扩展
 * 优点：
 *  遵守开闭原则
 *  对客户端隐藏对象的创建细节
 *  遵守单一原则
 * 缺点：
 *  添加子类需要添加成倍的文件数量
 *  只支出同一类产品的创建
 */
public interface MouseFactory {
    Mouse createMouse();
}
