package com.xxh.factory;

//一号零件工厂，可以生产窗户类型产品,也可以按需开辟其他的生产线
public class ConcretePartFactory1 extends AbstractPartFactory {

    @Override
    public AbstractWheel CreateWheel(String type) {

        return null;
    }

    @Override
    public AbstractWindow CreateWindow(String type) {
        if(type.equals("a")){
            return new WindowA();
        }
        if(type.equals("b")){
            return  new WindowB();
        }
        return null;
    }

    @Override
    public AbstractEngine CreateEngine(String type) {
        return null;
    }
}
