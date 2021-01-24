package com.erya.utils.impl;

import com.erya.utils.Call;
import org.springframework.stereotype.Component;

@Component
//@Component("bean")
public class CallImpl implements Call {
    public int add(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

    public int sub(int num1, int num2) {
        int result = num1-num2;
        return 0;
    }

    public int mul(int num1, int num2) {
        int result = num1 *num2;
        return result;
    }

    public int div(int num1, int num2) {
        int result = num1/num2;
        return result;
    }
}
