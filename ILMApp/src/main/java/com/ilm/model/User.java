package com.ilm.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "USER_TABLE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	
	@Column(name = "WORK_EMAIL")
	private String workEmail;

	@Column(name = "ORGANISATION")
	private String org;

	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;

	@Column(name = "ASSESSMENT_LEVEL")
	private String assessmentLvl;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "DATE_COMPLETED")
	private Timestamp dtCompleted;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userID) {
		userId = userID;
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

	public String getAssessmentLvl() {
		return assessmentLvl;
	}

	public void setAssessmentLvl(String assessmentLvl) {
		this.assessmentLvl = assessmentLvl;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getDtCompleted() {
		return dtCompleted;
	}

	public void setDtCompleted(Timestamp dtCompleted) {
		this.dtCompleted = dtCompleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", jobTitle=" + jobTitle + ", workEmail=" + workEmail + ", org=" + org + ", businessUnit="
				+ businessUnit + ", assessmentLvl=" + assessmentLvl + ", country=" + country + ", dtCompleted="
				+ dtCompleted + "]";
	}
	
	
	


}
