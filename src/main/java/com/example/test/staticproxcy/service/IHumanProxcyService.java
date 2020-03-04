package com.example.test.staticproxcy.service;

import com.example.test.staticproxcy.service.impl.Chinese;

public class IHumanProxcyService implements IHuman {
    private  IHuman human;
    public void  getRealInstance(Chinese chinese){
        this.human = chinese;
    }

    @Override
    public void sayHello() {
        beforeSayHello();
        human.sayHello();
        afterSayHello();

    }

    private void afterSayHello() {
        System.out.println("中国人打招呼后再摆摆手");
    }

    private void beforeSayHello() {
        System.out.println("中国人打招呼前先露个笑脸");
    }


}
