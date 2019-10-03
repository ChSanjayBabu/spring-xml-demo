package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext read = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = read.getBean("movie", Movie.class);
        movie.show();
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie obj =(Movie) factory.getBean("movie");
        obj.show();
    }
}
