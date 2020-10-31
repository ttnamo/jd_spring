package com.cybertek.services;

import com.cybertek.Interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {


    public int getHours() {
        return 5;
    }
}
