package com.erya.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(public int com.erya.utils.impl.CallImpl.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"functions的参数是"+ Arrays.toString(joinPoint.getArgs()));

    }
    @After("execution(public int com.erya.utils.impl.CallImpl.*(..))")
    public void after(){
        System.out.println("方法执行完毕");
    }
    @AfterReturning(value = "execution(public int com.erya.utils.impl.CallImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName()+"的结果是"+result);

    }
    @AfterThrowing(value = "execution(public int com.erya.utils.impl.CallImpl.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        System.out.println(joinPoint.getSignature().getName()+"方法抛出了异常："+exception);
    }
}
