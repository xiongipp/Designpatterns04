package com.xxh.builder;

import com.xxh.adapter.Ivoltage;
import com.xxh.factory.AbstractEngine;
import com.xxh.factory.AbstractWheel;
import com.xxh.factory.AbstractWindow;

public abstract class  ProductCar implements Cloneable{
    AbstractWindow window;
    AbstractWheel wheel;
    AbstractEngine engine;
    public AbstractWindow getWindow() {
        return window;
    }
    public void setWindow(AbstractWindow window) {
        this.window = window;
    }
    public AbstractWheel getWheel() {
        return wheel;
    }
    public void setWheel(AbstractWheel wheel) {
        this.wheel = wheel;
    }
    public AbstractEngine getEngine() {
        return engine;
    }
    public void setEngine(AbstractEngine engine) {
        this.engine = engine;
    }



    public void ShowCar(){
        System.out.println("我的引擎是："+engine.getName());
        System.out.println("我的轮子是："+wheel.getName());
        System.out.println("我的窗户是："+window.getName());
    }

    public Object clone(){
        Object object=null;
        try {
            object=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void Charge(Ivoltage carVoltage){
        int output = carVoltage.output();
        if(output==10){
            System.out.println("正在冲电");
        }
    }
}
