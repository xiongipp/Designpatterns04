package com.xxh.prototypecar;

import com.xxh.builder.Director;
import com.xxh.builder.ProductCar;

import java.util.Hashtable;

public class CarStore  {
   Hashtable<String, ProductCar> carstore=new Hashtable<>();
   //放样品车，返回的是克隆对象
    public ProductCar getCar(String carID){

        return (ProductCar) carstore.get(carID).clone();
    }

    public void setCar(String carID,ProductCar productCar){
        carstore.put(carID,productCar);
    }
}
