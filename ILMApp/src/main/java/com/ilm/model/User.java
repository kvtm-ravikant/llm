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
@Table(name = "user_table")
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
	
	@Column(name = "AGE")
	private String age;
	
	@Column(name = "TELEPHONE_NUMBER")
	private String telephone;
	
	@Column(name = "ETHNICITY")
	private String ethnicity;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "CARER")
	private String carer;
	
	@Column(name = "DISABLED")
	private String disabled;
	
	@Column(name = "SEXUAL_ORIENTATION")
	private String sexualOrientation;
	
	@Column(name = "DEGREE_EDUCATED")
	private String degreeEducated;
	
	@Column(name = "RELIGION")
	private String religion;

	/*@Column(name = "DATE_COMPLETED")
	private Timestamp dtCompleted;*/

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

	/*public Timestamp getDtCompleted() {
		return dtCompleted;
	}

	public void setDtCompleted(Timestamp dtCompleted) {
		this.dtCompleted = dtCompleted;
	}*/

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCarer() {
		return carer;
	}

	public void setCarer(String carer) {
		this.carer = carer;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getSexualOrientation() {
		return sexualOrientation;
	}

	public void setSexualOrientation(String sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}

	public String getDegreeEducated() {
		return degreeEducated;
	}

	public void setDegreeEducated(String degreeEducated) {
		this.degreeEducated = degreeEducated;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", jobTitle=" + jobTitle + ", workEmail=" + workEmail + ", org=" + org + ", businessUnit="
				+ businessUnit + ", assessmentLvl=" + assessmentLvl + ", country=" + country + ", age=" + age
				+ ", telephone=" + telephone + ", ethnicity=" + ethnicity + ", gender=" + gender + ", carer=" + carer
				+ ", disabled=" + disabled + ", sexualOrientation=" + sexualOrientation + ", degreeEducated="
				+ degreeEducated + ", religion=" + religion + "]";
	}
	
	
	


}
