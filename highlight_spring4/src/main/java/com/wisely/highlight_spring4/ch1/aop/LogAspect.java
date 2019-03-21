package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect                               // 注解声明一个切面
@Component                          // 通过 @Component 让此切面成为 Spring 容器管理的 Bean
public class LogAspect {

    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")   //注解声明切点
    public void annotationPointCut(){

    }

    @After("annotationPointCut()")      // 注解声明一个建言，并使用@PointCut定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());   // 通过反射可获得注解上的属性，然后做日志记录相关的操作
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")   //注解声明一个建言，此建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
