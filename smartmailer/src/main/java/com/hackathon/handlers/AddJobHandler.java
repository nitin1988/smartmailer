package com.hackathon.handlers;

import org.springframework.stereotype.Component;

import com.hackathon.entities.JobData;

@Component
public class AddJobHandler {
	
	public void addJob(JobData data){
		System.out.println(data.toString());
	}

}
