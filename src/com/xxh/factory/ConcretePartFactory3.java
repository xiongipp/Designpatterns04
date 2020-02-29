package com.xxh.factory;

//3号零件工厂，可以生产轮子,也可以开辟其他生产线
public class ConcretePartFactory3 extends AbstractPartFactory {

    @Override
    public AbstractWheel CreateWheel(String type) {
        if(type.equals("a")){
            return new WheelA();
        }
        if(type.equals("b")){
            return  new WheelB();
        }
        return null;
    }

    @Override
    public AbstractWindow CreateWindow(String type) {
        return null;
    }

    @Override
    public AbstractEngine CreateEngine(String type) {
        return null;
    }
}
