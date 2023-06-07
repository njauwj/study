package com.atwj.study.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut(value = "@annotation(com.atwj.study.annotation.Log)")
    public void MyPointCut() {
        //空方法仅用来定义切点表达式
    }

    @Before("MyPointCut()")
    public void saveLog() {
        System.out.println("正在保存日志");
    }


}
