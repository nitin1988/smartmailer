package com.hackathon.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"jobName",
"dateTime",
"recepientList",
"attachmentPath"
})
@JsonRootName("jobDesc")
public class AddJobRequest {

@JsonProperty("jobName")
private String jobName;
@JsonProperty("dateTime")
private String dateTime;
@JsonProperty("recepientList")
private String recepientList;
@JsonProperty(value="attachmentPath", required=false)
private String attachmentPath;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The jobName
*/
@JsonProperty("jobName")
public String getJobName() {
return jobName;
}

/**
* 
* @param jobName
* The jobName
*/
@JsonProperty("jobName")
public void setJobName(String jobName) {
this.jobName = jobName;
}

/**
* 
* @return
* The dateTime
*/
@JsonProperty("dateTime")
public String getDateTime() {
return dateTime;
}

/**
* 
* @param dateTime
* The dateTime
*/
@JsonProperty("dateTime")
public void setDateTime(String dateTime) {
this.dateTime = dateTime;
}

/**
* 
* @return
* The recepientList
*/
@JsonProperty("recepientList")
public String getRecepientList() {
return recepientList;
}

/**
* 
* @param recepientList
* The recepientList
*/
@JsonProperty("recepientList")
public void setRecepientList(String recepientList) {
this.recepientList = recepientList;
}

/**
* 
* @return
* The attachmentPath
*/
@JsonProperty(value="attachmentPath", required=false)
public String getAttachmentPath() {
return attachmentPath;
}

/**
* 
* @param attachmentPath
* The attachmentPath
*/
@JsonProperty("attachmentPath")
public void setAttachmentPath(String attachmentPath) {
this.attachmentPath = attachmentPath;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}