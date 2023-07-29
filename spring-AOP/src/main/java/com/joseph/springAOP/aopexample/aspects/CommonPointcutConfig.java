package com.joseph.springAOP.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class CommonPointcutConfig {

    @Pointcut("execution(* com.joseph.springAOP.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.joseph.springAOP.aopexample.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.joseph.springAOP.aopexample.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}

    @Pointcut("@annotation(com.joseph.springAOP.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation() {}
}
