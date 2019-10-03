package com.stackroute.domain;


public class Movie {
    Actor details;

    public void setDetails(Actor details) {
        this.details = details;
    }
    public void show()
    {
        System.out.println(details.getAge());
        System.out.println(details.getGender());
        System.out.println(details.getName());
    }
}
