package com.ilm.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ilm.model.User;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class statementReportDao {

	static final Logger LOGGER = Logger.getLogger(statementReportDao.class);

	/**
	 * Our dummy datasource. Retrieves a collection of data that is wrapped by a
	 * JRBeanCollectionDataSource.
	 * 
	 * @return a JRBeanCollectionDataSource collection
	 */
	public JRDataSource getDataSource(User u, List<Object[]> stmt) {

		List<String> pageOneData = new ArrayList<>();
		List<String> pageTwoData = new ArrayList<>();
		List<String> pageThreeData = new ArrayList<>();
		List<String> pageFourData = new ArrayList<>();
		List<String> pageFiveData = new ArrayList<>();
		List<String> pageSixData = new ArrayList<>();
		List<String> pageSevenData = new ArrayList<>();
		List<String> pageEightData = new ArrayList<>();
		List<String> pageNineData = new ArrayList<>();
		List<String> pageTenData = new ArrayList<>();

		// Create an array list of DemoModal
		List<statementReportModel> stmtReportList = new ArrayList<statementReportModel>();

		// We'll add three DemoModal items
		// You can populate data from a custom JDBC or DAO layer
		// For this demo, we'll create an in-memory list of items

		// Create first item
		statementReportModel stData = new statementReportModel();
		stData.setId(u.getUserId());
		stData.setFirstName(u.getFirstName());
		stData.setMiddleName(u.getMiddleName());
		stData.setLastName(u.getLastName());
		stData.setBusinessUnit(u.getBusinessUnit());
		stData.setOrg(u.getOrg());
		stData.setJobTitle(u.getJobTitle());
		stData.setWorkEmail(u.getWorkEmail());
		stData.setLevel(u.getAssessmentLvl());

		// String formattedDate = new
		// SimpleDateFormat("yyyyMMdd").format(u.getDtCompleted());
		stData.setDtCompleted(u.getDtCompleted());

		for (Object[] row : stmt) {
			if (row[1].equals(Integer.valueOf(1))) {
				pageOneData.add(row[5].toString());
			}
			if (row[1].equals(Integer.valueOf(2))) {
				pageTwoData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(3))){
				pageThreeData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(4))){
				pageFourData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(5))){
				pageFiveData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(6))){
				pageSixData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(7))){
				pageSevenData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(8))){
				pageEightData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(9))){
				pageNineData.add(row[5].toString());
			}
			if(row[1].equals(Integer.valueOf(10))){
				pageTenData.add(row[5].toString());
			}
		}

		LOGGER.info(pageOneData.toString());
		LOGGER.info("pageOneData length "+pageOneData.size());
		LOGGER.info("pageTwoData length "+pageTwoData.size());
		LOGGER.info("pageThreeData length "+pageThreeData.size());
		LOGGER.info("pageFourData length "+pageFourData.size());
		LOGGER.info("pageFiveData length "+pageFiveData.size());
		LOGGER.info("pageSixData length "+pageSixData.size());
		LOGGER.info("pageSevenData length "+pageSevenData.size());
		LOGGER.info("pageEightData length "+pageEightData.size());
		LOGGER.info("pageNineData length "+pageNineData.size());
		LOGGER.info("pageTenData length "+pageTenData.size());

		stData.setInclusiveLeadershipStmt(pageOneData);
		stData.setCommercialImpactDiversityStmt(pageTwoData);
		stData.setInclusiveTeamsandTeamworkStmt(pageThreeData);
		stData.setInclusiveGoalsandObjectivesStmt(pageFourData);
		stData.setInclusiveRolesResponsibilitiesStmt(pageFiveData);
		stData.setChallengingPrejudiceStmt(pageSixData);
		stData.setEthicalPracticeStmt(pageSevenData);
		stData.setCommitmentToDifferenceStmt(pageEightData);
		stData.setCollaborativePracticeValuesStmt(pageNineData);
		stData.setCollaborativeCommunicationsStmt(pageTenData);
		
		LOGGER.info("stData :"+stData.toString());

		stmtReportList.add(stData);

		// Wrap the collection in a JRBeanCollectionDataSource
		// This is one of the collections that Jasper understands
		JRDataSource ds = new JRBeanCollectionDataSource(stmtReportList);

		// Return the wrapped collection
		return ds;
	}

}
