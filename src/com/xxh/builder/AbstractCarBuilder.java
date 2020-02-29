package com.xxh.builder;

import com.xxh.factory.AbstractEngine;
import com.xxh.factory.AbstractWheel;
import com.xxh.factory.AbstractWindow;

//车车建造者
public abstract class AbstractCarBuilder {
   AbstractEngine abstractEngine;
   AbstractWheel abstractWheel;
   AbstractWindow abstractWindow;

    public AbstractEngine getAbstractEngine() {
        return abstractEngine;
    }

    public AbstractWheel getAbstractWheel() {
        return abstractWheel;
    }

    public AbstractWindow getAbstractWindow() {
        return abstractWindow;
    }

    public abstract void buildEngine(String type);
    public abstract void buildWheel(String type);
    public abstract void buildWindow(String type);
    public abstract void buildCar();
    public  abstract ProductCar getCar();
}
