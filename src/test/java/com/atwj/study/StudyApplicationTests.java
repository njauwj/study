package com.atwj.study;

import io.lettuce.core.resource.DefaultClientResources;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

;

@SpringBootTest
class StudyApplicationTests {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        DefaultClientResources bean = applicationContext.getBean(DefaultClientResources.class);
        System.out.println(bean);
    }

}