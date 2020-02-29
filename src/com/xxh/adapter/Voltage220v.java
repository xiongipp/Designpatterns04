package com.xxh.adapter;

public class Voltage220v {
    public Voltage220v(){
        elc=220;
    }
    private  int elc;

    public int  output(){
       System.out.println("这是220v的电压");
       return elc;
   }
}
