package com.anilt.scheduler.schedules;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    @Scheduled(cron = "0 * 17 * * ?") //Run between 5PM to 5:59 PM
    public void cronJobSch(){
        System.out.println("Scheduled Job : "+ getDate());
    }

    @Scheduled(fixedRate = 10000)
    public void fixedRateSch(){
        System.out.println("Fixed rate scheduler : "+getDate());
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void fixedDelaySch(){
        System.out.println("Fixed Delay Scheduler : "+ getDate());
    }

    private String getDate(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }
}
