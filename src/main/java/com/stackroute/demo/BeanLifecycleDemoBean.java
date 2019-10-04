package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : ");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
    public void initializer()
    {
        System.out.println("just initialized");

    }
    public  void destroyer()
    {
        System.out.println("destroyed");
    }

}
