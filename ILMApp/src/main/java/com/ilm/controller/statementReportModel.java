package com.ilm.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
	private String level;
	private Date dtCompleted;
	private List<String> inclusiveLeadershipStmt;
	private List<String> commercialImpactDiversityStmt;
	private List<String> inclusiveTeamsandTeamworkStmt;
	private List<String> inclusiveGoalsandObjectivesStmt;
	private List<String> inclusiveRolesResponsibilitiesStmt;

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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getDtCompleted() {
		return dtCompleted;
	}

	public void setDtCompleted(Timestamp dtCompleted) {

		// java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(dtCompleted.getTime());
		LOGGER.info("dtCompleted " + dtCompleted);
		this.dtCompleted = sqlDate;
	}

	public List<String> getInclusiveLeadershipStmt() {
		return inclusiveLeadershipStmt;
	}

	public void setInclusiveLeadershipStmt(List<String> inclusiveLeadershipStmt) {
		this.inclusiveLeadershipStmt = inclusiveLeadershipStmt;
	}

	public List<String> getCommercialImpactDiversityStmt() {
		return commercialImpactDiversityStmt;
	}

	public void setCommercialImpactDiversityStmt(List<String> commercialImpactDiversityStmt) {
		this.commercialImpactDiversityStmt = commercialImpactDiversityStmt;
	}

	public List<String> getInclusiveTeamsandTeamworkStmt() {
		return inclusiveTeamsandTeamworkStmt;
	}

	public void setInclusiveTeamsandTeamworkStmt(List<String> inclusiveTeamsandTeamworkStmt) {
		this.inclusiveTeamsandTeamworkStmt = inclusiveTeamsandTeamworkStmt;
	}

	public List<String> getInclusiveGoalsandObjectivesStmt() {
		return inclusiveGoalsandObjectivesStmt;
	}

	public void setInclusiveGoalsandObjectivesStmt(List<String> inclusiveGoalsandObjectivesStmt) {
		this.inclusiveGoalsandObjectivesStmt = inclusiveGoalsandObjectivesStmt;
	}

	public List<String> getInclusiveRolesResponsibilitiesStmt() {
		return inclusiveRolesResponsibilitiesStmt;
	}

	public void setInclusiveRolesResponsibilitiesStmt(List<String> inclusiveRolesResponsibilitiesStmt) {
		this.inclusiveRolesResponsibilitiesStmt = inclusiveRolesResponsibilitiesStmt;
	}

	@Override
	public String toString() {
		return "statementReportModel [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", jobTitle=" + jobTitle + ", workEmail=" + workEmail + ", org=" + org
				+ ", businessUnit=" + businessUnit + ", dtCompleted=" + dtCompleted + ", inclusiveLeadershipStmt="
				+ inclusiveLeadershipStmt + ", commercialImpactDiversityStmt=" + commercialImpactDiversityStmt
				+ ", inclusiveTeamsandTeamworkStmt=" + inclusiveTeamsandTeamworkStmt
				+ ", inclusiveGoalsandObjectivesStmt=" + inclusiveGoalsandObjectivesStmt
				+ ", inclusiveRolesResponsibilitiesStmt=" + inclusiveRolesResponsibilitiesStmt + "]";
	}

	

}
