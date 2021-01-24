package com.erya.test;

import com.erya.utils.Call;
import com.erya.utils.MyInvocationHandler;
import com.erya.utils.impl.CallImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        Call proxy = (Call) context.getBean("callImpl");
//        Call proxy = (Call) context.getBean("bean");
        proxy.add(1,2);
        proxy.div(1,0);

    }
}
