package com.cybertek.Services;


import com.cybertek.Interfeaces.Course;


public class  Java implements Course {

 private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHours() {
        System.out.println(" Java weekly teaching hours " +(20+ officeHours.getHours()));
    }
}
