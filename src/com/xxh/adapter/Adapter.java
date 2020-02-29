package com.xxh.adapter;

//车适配器
public class Adapter implements Ivoltage {


    Voltage220v voltage220v;
    public Adapter(Voltage220v v) {
        voltage220v = v;
    }


    @Override
    public int  output() {
        int elc = voltage220v.output();
        System.out.println("电压变成了："+elc/22);
        return elc/22;
    }
}
