package com.cybertek.services;


import com.cybertek.Interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Java implements Course {

    //Fild injection
    @Autowired
    private OfficeHours officeHours;

//
//    // Constractore Injection
//   // @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }
//


//    //Setter injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }




    @Override
    public void getTeachingHours(){
        System.out.println("Weekly java teaching hours :"+( 30 + officeHours.getHours()));
    }
}
