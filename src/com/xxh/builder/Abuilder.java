package com.xxh.builder;

import com.xxh.factory.AbstractWindow;
import com.xxh.factory.ConcretePartFactory1;
import com.xxh.factory.ConcretePartFactory2;
import com.xxh.factory.ConcretePartFactory3;
import com.xxh.prototypecar.ACar;

public class Abuilder extends AbstractCarBuilder {
    ACar car;
    @Override
    public void buildEngine(String type) {
        ConcretePartFactory2 engineFactory=new ConcretePartFactory2();
        super.abstractEngine=engineFactory.CreateEngine(type);
    }
    @Override
    public void buildWheel(String type) {

        ConcretePartFactory3 wheelFactory = new ConcretePartFactory3();
        super.abstractWheel=wheelFactory.CreateWheel(type);
    }

    @Override
    public void buildWindow(String type) {

        ConcretePartFactory1 windowFactory=new ConcretePartFactory1();
        AbstractWindow window = windowFactory.CreateWindow(type);
        super.abstractWindow=window;
    }
    @Override
    public void buildCar(){
        car=new ACar();
        car.setWheel(super.abstractWheel);
        car.setWindow(super.abstractWindow);
        car.setEngine(super.abstractEngine);
    }
    public ACar getCar(){
        return car;
    }
}
