package com.example.test.cglibProxcy;

public class Test {
    public static void main(String[] args) {
        CglibProxcyObject cglibProxcyObject = new CglibProxcyObject(new Japniese());
        Japniese japniese = (Japniese)cglibProxcyObject.getProxcyInstance();
        japniese.sayHello();
    }
}
