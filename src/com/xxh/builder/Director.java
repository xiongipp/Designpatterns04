package com.xxh.builder;

import com.xxh.prototypecar.ACar;
import com.xxh.prototypecar.BCar;
import com.xxh.prototypecar.mixCar;

public class Director {

    public ACar getACar(){
        AbstractCarBuilder builder;
        builder=new Abuilder();
        builder.buildEngine("a");
        builder.buildWheel("a");
        builder.buildWindow("a");
        builder.buildCar();
        return (ACar) builder.getCar();
    }
    public BCar getBCar(){
        AbstractCarBuilder builder;
        builder=new Bbuilder();
        builder.buildWindow("b");
        builder.buildEngine("b");
        builder.buildWheel("b");
        builder.buildCar();
        return (BCar) builder.getCar();
    }
    public mixCar getMixCar(){
        mixCarBuilder builder = new mixCarBuilder();
        builder.buildEngine("b");
        builder.buildWheel("b");
        builder.buildWindow("a");
        builder.buildCar();
        return (mixCar) builder.getCar();
    }
}
