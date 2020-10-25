package com.cybertek.Services;


import com.cybertek.Interfeaces.Course;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class  Java implements Course {

 private OfficeHours officeHours;


    public void getTeachingHours() {
        System.out.println(" Java weekly teaching hours " +(20+ officeHours.getHours()));
    }
}
