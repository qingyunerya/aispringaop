package com.erya.test;

import com.erya.utils.Call;
import com.erya.utils.MyInvocationHandler;
import com.erya.utils.impl.CallImpl;

import java.lang.reflect.InvocationHandler;

public class Test {

    public static void main(String[] args) {

        Call call = new CallImpl();
//        call.add(1,2);
//        call.sub(2,3);
//        call.mul(3,4);
//        call.div(4,5);
        MyInvocationHandler handler =new MyInvocationHandler();
        Call call1 = (Call) handler.bind(call);
        call1.div(1,2);
        call1.sub(2,3);
        call1.add(3,4);
        call1.mul(4,5);

    }
}
