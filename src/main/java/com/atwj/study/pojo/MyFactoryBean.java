package com.atwj.study.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: wj
 * @create_time: 2023/5/25 10:58
 * @explain:
 */
public class MyFactoryBean implements FactoryBean<User> {


    private static User user;

    @Override
    public User getObject() throws Exception {
        if (user == null) {
            user = new User();
            return user;
        }
        return user;
    }



    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
