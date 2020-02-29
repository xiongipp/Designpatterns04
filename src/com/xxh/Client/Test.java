package com.xxh.Client;

import com.xxh.adapter.Adapter;
import com.xxh.adapter.Ivoltage;
import com.xxh.adapter.Voltage220v;
import com.xxh.builder.Director;
import com.xxh.builder.ProductCar;
import com.xxh.prototypecar.ACar;
import com.xxh.prototypecar.BCar;
import com.xxh.prototypecar.CarStore;
import com.xxh.prototypecar.mixCar;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Director director=new Director();
        //测试建造者模式
        ACar aCar = director.getACar();
        BCar bCar = director.getBCar();
        mixCar mixCar = director.getMixCar();

        //carStore是原型管理器
        CarStore carStore=new CarStore();
        carStore.setCar("1",aCar);
        carStore.setCar("2",bCar);
        carStore.setCar("3",mixCar);

        //测试原型模式
        ProductCar car1 = carStore.getCar("1");
        ProductCar car2=carStore.getCar("1");
        car1.ShowCar();
        car2.ShowCar();
        System.out.println(car1.equals(car2));//显示false,属性相同，但两个是不同的对象

        //测试适配器（我想不出来怎么串了）
        Voltage220v voltage220v = new Voltage220v();
        //适配成合适的口
        Ivoltage ivoltage = new Adapter(voltage220v);
        car1.Charge(ivoltage);



    }
}
