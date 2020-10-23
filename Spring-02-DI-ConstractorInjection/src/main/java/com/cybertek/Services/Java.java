package com.cybertek.Services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

   //OfficeHours officeHours;
    ExtraSessions extraSessions;

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println(" Java weekly teaching hours " +(20+ extraSessions.getHours()));
    }
}
