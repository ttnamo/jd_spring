package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Override
    public void getTeachingHours(){
        System.out.println("Weekly selenium teaching hours : 23");
    }
}
