package com.ilm.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.log4j.Logger;

public class statementReportModel {
	
	static final Logger LOGGER = Logger.getLogger(statementReportModel.class);
	
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String jobTitle;
	private String workEmail;
	private String org;
	private String businessUnit;
	private Date dtCompleted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getWorkEmail() {
		return workEmail;
	}
	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public Date getDtCompleted() {
		return dtCompleted;
	}
	public void setDtCompleted(Timestamp dtCompleted) {
		
//		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(dtCompleted.getTime());
		LOGGER.info("dtCompleted "+dtCompleted);
		this.dtCompleted = sqlDate;
	}
	
	@Override
	public String toString() {
		return "statementReportModel [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", jobTitle=" + jobTitle + ", workEmail=" + workEmail + ", org=" + org
				+ ", businessUnit=" + businessUnit + ", dtCompleted=" + dtCompleted + "]";
	}
	
	

}
