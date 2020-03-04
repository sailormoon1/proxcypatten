package com.example.test.staticproxcy.service.impl;

import com.example.test.staticproxcy.service.IHuman;

public class Chinese implements IHuman {
    @Override
    public void sayHello() {
        System.out.println("你好");
    }
}
