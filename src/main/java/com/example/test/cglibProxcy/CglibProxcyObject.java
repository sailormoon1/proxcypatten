package com.example.test.cglibProxcy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxcyObject implements MethodInterceptor {
    private Object target;
    CglibProxcyObject(Object object){
        this.target = object;
    }
    Object getProxcyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return method.invoke(target,objects);
    }
}
