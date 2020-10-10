package com.demo.factory.method;

import com.demo.factory.entity.HpMouse;
import com.demo.factory.entity.Mouse;

public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
