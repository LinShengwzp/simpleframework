package com.demo.factory.method;


import com.demo.factory.entity.DellMouse;
import com.demo.factory.entity.Mouse;

public class DellMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
