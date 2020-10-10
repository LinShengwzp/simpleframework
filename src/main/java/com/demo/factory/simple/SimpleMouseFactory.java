package com.demo.factory.simple;

import com.demo.factory.entity.DellMouse;
import com.demo.factory.entity.HpMouse;
import com.demo.factory.entity.Mouse;

/**
 * 简单工厂模式
 * 优缺点：
 *  优点：
 *      可以对创建对象进行“加工”，对客户端隐藏相关细节
 *  缺点：
 *      1 因创建逻辑复杂或者创建对象过多而造成代码臃肿
 *      2 增删子类均会违法开闭原则
 *
 * 开闭原则：
 *  一个软件实体，应该对扩展开放，对修改关闭
 *      应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化
 */
public class SimpleMouseFactory {
    public static Mouse createMouse( int type) {
        switch (type) {
            case 0: return new DellMouse();
            case 1: return new HpMouse();
            default: return new DellMouse();
        }
    }

    public static void main(String[] args) {
        System.out.printf(SimpleMouseFactory.createMouse(0).mouseName());
    }

}
