package com.example.test.staticproxcy.service;

import com.example.test.staticproxcy.service.impl.Chinese;

public class TestClient {
    public static void main(String[] args) {
        IHumanProxcyService humanProxcyService = new IHumanProxcyService();
        humanProxcyService.getRealInstance(new Chinese());
        humanProxcyService.sayHello();
    }


}
