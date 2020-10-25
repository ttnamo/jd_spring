package com.cybertek.Services;


import com.cybertek.Interfeaces.Course;
import com.cybertek.Interfeaces.ExtraSessions;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class  Java implements Course {

 //private OfficeHours officeHours;
    private ExtraSessions extraSessions;


    public void getTeachingHours() {
        System.out.println(" Java weekly teaching hours " +(20+ extraSessions.getHours()));
    }
}
