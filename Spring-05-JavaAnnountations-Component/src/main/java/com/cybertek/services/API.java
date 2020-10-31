package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("api teching hours is : 6");
    }
}
