package com.example.test.jdkcproxcy.service.impl;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxcyHandler implements InvocationHandler {
    private  Object realTarget;
    public   JdkProxcyHandler(Object realTarget){
        this.realTarget= realTarget;
    }
    public Object getJdkProxcyInstance(){
        return  Proxy.newProxyInstance(realTarget.getClass().getClassLoader(),realTarget.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(realTarget,args);
    }
}
