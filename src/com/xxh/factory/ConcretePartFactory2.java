package com.xxh.factory;

//2号零件工厂，可以生产引擎，也可以开辟其他的生产线
public class ConcretePartFactory2 extends AbstractPartFactory {
    @Override
    public AbstractWheel CreateWheel(String type) {
        return null;
    }
    @Override
    public AbstractWindow CreateWindow(String type) {
        return null;
    }
    @Override
    public AbstractEngine CreateEngine(String type) {
        if(type.equals("a")){
            return new EngineA();
        }
        if(type.equals("b")){
            return  new EngineB();
        }
        return null;
    }
}
