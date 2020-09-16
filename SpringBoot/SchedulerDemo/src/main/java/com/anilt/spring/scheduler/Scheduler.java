package com.anilt.spring.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	@Scheduled(cron = "1 * 4 * * ?")
	public void cronJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String startDate = sdf.format(now);
		System.out.println("Java cron job expression :: "+ startDate);
	}
	
	@Scheduled(fixedRate = 10000)
	   public void fixedRateSch() {
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	      Date now = new Date();
	      String strDate = sdf.format(now);
	      System.out.println("Fixed Rate scheduler:: " + strDate);
	   }
}
