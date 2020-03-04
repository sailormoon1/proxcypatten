package com.example.test.jdkcproxcy.service;

import com.example.test.jdkcproxcy.service.impl.American;
import com.example.test.jdkcproxcy.service.impl.Chinese;
import com.example.test.jdkcproxcy.service.impl.JdkProxcyHandler;

public class TestClient {
    public static void main(String[] args) {
        IHuman chinese=  new Chinese();
        sayHello(chinese);


        IHuman american=  new American();
        sayHello(american);

    }

    private static void sayHello(IHuman human) {
        JdkProxcyHandler jdkProxcyHandler = new JdkProxcyHandler(human);
        Object object = jdkProxcyHandler.getJdkProxcyInstance();
        IHuman humanProxcy = (IHuman) object;
        humanProxcy.sayHello();
    }
}
