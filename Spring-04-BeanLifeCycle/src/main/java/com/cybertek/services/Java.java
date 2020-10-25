package com.cybertek.services;


import com.cybertek.interfaces.Course;

public class Java implements Course {

    @Override
    public void getTeachingHours(){
        System.out.println("weekly teaching hours : 20");
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDestroyMethode(){
        System.out.println("Excuting destroy methode");
    }
}