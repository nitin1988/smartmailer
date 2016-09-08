package com.hackathon.controller;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.entities.JobData;
import com.hackathon.request.AddJobRequest;

@SpringBootApplication
public class SmartmailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartmailerApplication.class, args);
	}
}

@RestController
class SmartMailController {
    
    private static final String SUCCESS = "success";
	private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm:ss");
	
	@RequestMapping(value="/mail/addjob", consumes="application/json", produces="application/json")
    public String addJobToQueue(@RequestBody AddJobRequest job) {
		JobData data =  mapRequestToData(job);
		System.out.println(data);
        return SUCCESS;
    }
	
	private JobData mapRequestToData(AddJobRequest job){
		JobData jobData = new JobData();
		jobData.setJobName(job.getJobName());
		System.out.println(job.getDateTime());
		jobData.setDateTime(DateTime.parse(job.getDateTime(), formatter));
		jobData.setRecepientList(Arrays.asList(job.getRecepientList().split(",")));
		jobData.setAttachmentPath(job.getAttachmentPath());
		return jobData;
		
	}
}