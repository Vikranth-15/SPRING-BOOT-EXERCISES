package com.practice.spring.TodaysDate;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {

    @GetMapping("/")
    public String getDate(){
        Date d=new Date();
        return String.valueOf(d);
    }
}
