package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        ApplicationContext read = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = read.getBean("movie1",Movie.class);
        Movie movie2 = read.getBean("movie2",Movie.class);
        ((AbstractApplicationContext)read).registerShutdownHook();
//        movie1.show();
//        movie2.show();
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie obj =(Movie) factory.getBean("movie");
//        obj.show();
    }
}
