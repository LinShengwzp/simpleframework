package com.demo.factory.abstractf;

import com.demo.factory.entity.DellKeyBoard;
import com.demo.factory.entity.DellMouse;
import com.demo.factory.entity.IKeyBoard;
import com.demo.factory.entity.Mouse;

/**
 * 创建不同的具体工厂继承抽象工厂内容
 * 在定义工厂变量之后，赋值变量为不同的具体实现
 * 即可调用不同的具体工厂实例
 */
public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public IKeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
