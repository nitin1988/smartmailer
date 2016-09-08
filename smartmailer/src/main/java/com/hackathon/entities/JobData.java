package com.hackathon.entities;
import java.util.List;

import org.joda.time.DateTime;

public class JobData {
	
	private String jobName;
	private DateTime dateTime;
	private List<String> recepientList;
	private String attachmentPath;
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public DateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}
	public List<String> getRecepientList() {
		return recepientList;
	}
	public void setRecepientList(List<String> recepientList) {
		this.recepientList = recepientList;
	}
	public String getAttachmentPath() {
		return attachmentPath;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}
	@Override
	public String toString() {
		return "JobData [jobName=" + jobName + ", dateTime=" + dateTime + ", recepientList=" + recepientList
				+ ", attachmentPath=" + attachmentPath + "]";
	}
	
	

}
