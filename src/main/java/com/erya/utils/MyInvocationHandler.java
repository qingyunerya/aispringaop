package com.erya.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {


    private Object object = null;

    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(),this.object.getClass().getInterfaces(),this);

    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"的参数是"+ Arrays.toString(args));
        Object result = method.invoke(this.object,args);
        System.out.println(method.getName()+"的结果是"+result);
        return result;
    }
}
