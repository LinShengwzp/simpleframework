package com.demo.factory.entity;

public class DellKeyBoard implements IKeyBoard {
    @Override
    public void sayHello() {
        System.out.println("我是戴尔键盘");
    }
}
