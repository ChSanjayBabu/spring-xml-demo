package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Movie implements ApplicationContextAware , BeanFactoryAware , BeanNameAware {
    Actor details;
    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory.getBean("movie1"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("in application conetxt");
    }

    public Movie() {
    }

    public Movie(Actor details)
    {
        this.details=details;
    }
    public void setDetails(Actor details) {
        this.details = details;
    }
    public void show()
    {
        System.out.println(details.getAge());
        System.out.println(details.getGender());
        System.out.println(details.getName());
    }

    @Override
    public String toString() {
        return details.getName()+" "+details.getGender()+" "+details.getAge();
    }
}
