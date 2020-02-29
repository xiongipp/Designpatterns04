package com.xxh.factory;

//抽象零件工厂1
public abstract class AbstractPartFactory {
    abstract public AbstractWheel CreateWheel(String type);
    abstract public AbstractWindow CreateWindow(String type);
    abstract public AbstractEngine CreateEngine(String type);
}
