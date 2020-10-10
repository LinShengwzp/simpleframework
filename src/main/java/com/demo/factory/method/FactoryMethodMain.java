package com.demo.factory.method;

import com.demo.factory.entity.Mouse;

/**
 *
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        MouseFactory mf = new HpMouseFactory();
        Mouse mouse = mf.createMouse();
        System.out.println(mouse.mouseName());
    }
}
