package com.demo.factory.abstractf;

import com.demo.factory.entity.IKeyBoard;
import com.demo.factory.entity.Mouse;

public interface ComputerFactory {
    Mouse createMouse();
    IKeyBoard createKeyBoard();
}
