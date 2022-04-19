package com.example.demo.global.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Entity 리스너는 빈생성을 못해주기 때문에 빈유틸을 다로 만들어준다.
@Component
public class BeanUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanUtils.applicationContext = applicationContext;
    }

    public static<T> T getBean(Class<T> clazz){
        return applicationContext.getBean(clazz);
    }

}
