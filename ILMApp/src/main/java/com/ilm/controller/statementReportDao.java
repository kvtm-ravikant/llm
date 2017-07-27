package com.ilm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ilm.model.Message;
//import com.ilm.model.MessageFragment;
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

		List<String> leftInclusiveLeadershipStmt = new ArrayList<>();
		List<String> rightInclusiveLeadershipStmt = new ArrayList<>();

		List<String> LeftCommercialImpactDiversityStmt = new ArrayList<>();
		List<String> rightCommercialImpactDiversityStmt = new ArrayList<>();

		List<String> leftInclusiveTeamsandTeamworkStmt = new ArrayList<>();
		List<String> rightInclusiveTeamsandTeamworkStmt = new ArrayList<>();

		List<String> leftInclusiveGoalsandObjectivesStmt = new ArrayList<>();
		List<String> rightInclusiveGoalsandObjectivesStmt = new ArrayList<>();
		
		List<String> leftInclusiveRolesResponsibilitiesStmt = new ArrayList<>();
		List<String> rightInclusiveRolesResponsibilitiesStmt = new ArrayList<>();
		
		List<String> leftChallengingPrejudiceStmt = new ArrayList<>();
		List<String> rightChallengingPrejudiceStmt = new ArrayList<>();
		
		List<String> leftEthicalPracticeStmt = new ArrayList<>();
		List<String> rightEthicalPracticeStmt = new ArrayList<>();
		
		List<String> leftCommitmentToDifferenceStmt = new ArrayList<>();
		List<String> rightCommitmentToDifferenceStmt = new ArrayList<>();
		
		List<String> leftCollaborativePracticeValuesStmtt = new ArrayList<>();
		List<String> rightCollaborativePracticeValuesStmtt = new ArrayList<>();
				
		List<String> leftCollaborativeCommunicationsStmt = new ArrayList<>();
		List<String> rightCollaborativeCommunicationsStmt = new ArrayList<>();

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
				leftInclusiveLeadershipStmt.add(row[7].toString());
				leftInclusiveLeadershipStmt.add(row[8].toString());

//				leftInclusiveLeadershipStmt.add("<li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li>");
//				rightInclusiveLeadershipStmt.add("");
			}
			if (row[1].equals(Integer.valueOf(2))) {
				pageTwoData.add(row[5].toString());
				LeftCommercialImpactDiversityStmt.add(row[7].toString());
				LeftCommercialImpactDiversityStmt.add(row[8].toString());
//				rightCommercialImpactDiversityStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(3))) {
				pageThreeData.add(row[5].toString());
				leftInclusiveTeamsandTeamworkStmt.add(row[7].toString());
				leftInclusiveTeamsandTeamworkStmt.add(row[8].toString());
//				rightInclusiveTeamsandTeamworkStmt.add(row[8].toString());
				
			}
			if (row[1].equals(Integer.valueOf(4))) {
				pageFourData.add(row[5].toString());
				leftInclusiveGoalsandObjectivesStmt.add(row[7].toString());
				leftInclusiveGoalsandObjectivesStmt.add(row[8].toString());
//				rightInclusiveGoalsandObjectivesStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(5))) {
				pageFiveData.add(row[5].toString());
				leftInclusiveRolesResponsibilitiesStmt.add(row[7].toString());
				leftInclusiveRolesResponsibilitiesStmt.add(row[8].toString());
//				rightInclusiveRolesResponsibilitiesStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(6))) {
				pageSixData.add(row[5].toString());
				leftChallengingPrejudiceStmt.add(row[7].toString());
				leftChallengingPrejudiceStmt.add(row[8].toString());
//				rightChallengingPrejudiceStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(7))) {
				pageSevenData.add(row[5].toString());
				leftEthicalPracticeStmt.add(row[7].toString());
				leftEthicalPracticeStmt.add(row[8].toString());
//				rightEthicalPracticeStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(8))) {
				pageEightData.add(row[5].toString());
				leftCommitmentToDifferenceStmt.add(row[7].toString());
				leftCommitmentToDifferenceStmt.add(row[8].toString());
//				rightCommitmentToDifferenceStmt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(9))) {
				pageNineData.add(row[5].toString());
				leftCollaborativePracticeValuesStmtt.add(row[7].toString());
				leftCollaborativePracticeValuesStmtt.add(row[8].toString());
//				rightCollaborativePracticeValuesStmtt.add(row[8].toString());
			}
			if (row[1].equals(Integer.valueOf(10))) {
				pageTenData.add(row[5].toString());
				leftCollaborativeCommunicationsStmt.add(row[7].toString());
				leftCollaborativeCommunicationsStmt.add(row[8].toString());
//				rightCollaborativeCommunicationsStmt.add(row[8].toString());
			}
		}
//		leftInclusiveLeadershipStmt = new ArrayList<>(); 
//		leftInclusiveLeadershipStmt.add("<li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Acknowledge all faiths present in your workplace.</li><li>Demonstrate a knowledge and interest in other cultures.</li><li>Admit you don’t know the answer when you don’t, and seek opinions from those around you.</li><li>Exert effort to identify your own biases, and find ways to manage them in the workplace.</li><li>Demonstrate open-mindedness, a passion for learning, and a desire for exposure to different ideas</li><li>Show acceptance of everyone without bias.</li><li>Have self-awareness of how preconceived</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li><li>Learn about the cultural backgrounds, lives and interests of colleagues outside of the work place.</li><li>Be creative, flexible and look for new ways of doing things.</li>");
		LOGGER.info(pageOneData.toString());
		LOGGER.info("pageOneData length " + pageOneData.size());
		LOGGER.info("pageTwoData length " + pageTwoData.size());
		LOGGER.info("pageThreeData length " + pageThreeData.size());
		LOGGER.info("pageFourData length " + pageFourData.size());
		LOGGER.info("pageFiveData length " + pageFiveData.size());
		LOGGER.info("pageSixData length " + pageSixData.size());
		LOGGER.info("pageSevenData length " + pageSevenData.size());
		LOGGER.info("pageEightData length " + pageEightData.size());
		LOGGER.info("pageNineData length " + pageNineData.size());
		LOGGER.info("pageTenData length " + pageTenData.size());

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

		List<Message> inclusiveLeadershipStmtObjList = new ArrayList<Message>();
		inclusiveLeadershipStmtObjList.add(new Message(divideMessageForOneColumnsLayout(pageOneData),
				divideMessageForOneColumnsLayout(leftInclusiveLeadershipStmt),
				divideMessageForOneColumnsLayout(rightInclusiveLeadershipStmt)));
		stData.setInclusiveLeadershipStmtList(inclusiveLeadershipStmtObjList);

		List<Message> commercialImpactDiversityStmtList = new ArrayList<Message>();
		commercialImpactDiversityStmtList.add(new Message(divideMessageForOneColumnsLayout(pageTwoData),
				divideMessageForOneColumnsLayout(LeftCommercialImpactDiversityStmt),
				divideMessageForOneColumnsLayout(rightCommercialImpactDiversityStmt)));
		stData.setCommercialImpactDiversityStmtList(commercialImpactDiversityStmtList);

		List<Message> inclusiveTeamsandTeamworkStmtList = new ArrayList<Message>();
		inclusiveTeamsandTeamworkStmtList.add(new Message(divideMessageForOneColumnsLayout(pageThreeData), 
				divideMessageForOneColumnsLayout(leftInclusiveTeamsandTeamworkStmt),
				divideMessageForOneColumnsLayout(rightInclusiveTeamsandTeamworkStmt)));
		stData.setInclusiveTeamsandTeamworkStmtList(inclusiveTeamsandTeamworkStmtList);

		List<Message> inclusiveGoalsandObjectivesStmtList = new ArrayList<Message>();
		inclusiveGoalsandObjectivesStmtList
				.add(new Message(divideMessageForOneColumnsLayout(pageFourData),
						divideMessageForOneColumnsLayout(leftInclusiveGoalsandObjectivesStmt),
						divideMessageForOneColumnsLayout(rightInclusiveGoalsandObjectivesStmt)));
		stData.setInclusiveGoalsandObjectivesStmtList(inclusiveGoalsandObjectivesStmtList);

		List<Message> inclusiveRolesResponsibilitiesStmtList = new ArrayList<Message>();
		inclusiveRolesResponsibilitiesStmtList
				.add(new Message(divideMessageForOneColumnsLayout(pageFiveData),
						divideMessageForOneColumnsLayout(leftInclusiveRolesResponsibilitiesStmt),
						divideMessageForOneColumnsLayout(rightInclusiveRolesResponsibilitiesStmt)));
		stData.setInclusiveRolesResponsibilitiesStmtList(inclusiveRolesResponsibilitiesStmtList);

		List<Message> challengingPrejudiceStmtList = new ArrayList<Message>();
		challengingPrejudiceStmtList.add(new Message(divideMessageForOneColumnsLayout(pageSixData),
				divideMessageForOneColumnsLayout(leftChallengingPrejudiceStmt),
				divideMessageForOneColumnsLayout(rightChallengingPrejudiceStmt)));
		stData.setChallengingPrejudiceStmtList(challengingPrejudiceStmtList);

		List<Message> ethicalPracticeStmtList = new ArrayList<Message>();
		ethicalPracticeStmtList.add(new Message(divideMessageForOneColumnsLayout(pageSevenData), 
				divideMessageForOneColumnsLayout(leftEthicalPracticeStmt),
				divideMessageForOneColumnsLayout(rightEthicalPracticeStmt)));
		stData.setEthicalPracticeStmtList(ethicalPracticeStmtList);

		List<Message> commitmentToDifferenceStmtList = new ArrayList<Message>();
		commitmentToDifferenceStmtList.add(new Message(divideMessageForOneColumnsLayout(pageEightData), 
				divideMessageForOneColumnsLayout(leftCommitmentToDifferenceStmt),
				divideMessageForOneColumnsLayout(rightCommitmentToDifferenceStmt)));
		stData.setCommitmentToDifferenceStmtList(commitmentToDifferenceStmtList);

		List<Message> collaborativePracticeValuesStmttList = new ArrayList<Message>();
		collaborativePracticeValuesStmttList
				.add(new Message(divideMessageForOneColumnsLayout(pageEightData),
						divideMessageForOneColumnsLayout(leftCollaborativePracticeValuesStmtt),
						divideMessageForOneColumnsLayout(rightCollaborativePracticeValuesStmtt)));
		stData.setCollaborativePracticeValuesStmttList(collaborativePracticeValuesStmttList);

		List<Message> collaborativeCommunicationsStmtList = new ArrayList<Message>();
		collaborativeCommunicationsStmtList
				.add(new Message(divideMessageForOneColumnsLayout(pageEightData),
						divideMessageForOneColumnsLayout(leftCollaborativeCommunicationsStmt),
						divideMessageForOneColumnsLayout(rightCollaborativeCommunicationsStmt)));
		stData.setCollaborativeCommunicationsStmtList(collaborativeCommunicationsStmtList);

		LOGGER.info("stData :" + stData.toString());

		stmtReportList.add(stData);

		// Wrap the collection in a JRBeanCollectionDataSource
		// This is one of the collections that Jasper understands
		JRDataSource ds = new JRBeanCollectionDataSource(stmtReportList);

		// Return the wrapped collection
		return ds;
	}

	private String divideMessageForOneColumnsLayout(List<String> stmtList) {
		String mf = "";
		for (String stmt : stmtList) {
			mf += wrapInBulletTag(stmt);
		}
		return mf;
	}

	// private MessageFragment divideMessageForTwoColumnsLayout(List<String>
	// stmtList){
	// Map<Integer, MessageFragment> pageMap = new HashMap<Integer,
	// MessageFragment>();
	// Integer currentPage = 0;
	// pageMap.put(currentPage, new MessageFragment("",""));
	// for(String stmt : stmtList){
	// if(moveToNextPage(pageMap, currentPage)){
	// currentPage++;
	// pageMap.put(currentPage, new MessageFragment("",""));
	// }
	// if(moveToRight(pageMap,currentPage)){
	// MessageFragment mf = (MessageFragment) pageMap.get(currentPage);
	// mf.setSecondHalfFragment(mf.getSecondHalfFragment()+wrapInBulletTag(stmt));
	// }
	// else{
	// MessageFragment mf = (MessageFragment) pageMap.get(currentPage);
	// mf.setFirstHalfFragment(mf.getFirstHalfFragment()+wrapInBulletTag(stmt));
	// }
	// }
	// String left = "";
	// String right = "";
	// for(MessageFragment mf : pageMap.values()){
	// left+=mf.getFirstHalfFragment();
	// right+=mf.getSecondHalfFragment();
	// }
	// MessageFragment mf = new MessageFragment(left,right);
	// return mf;
	// }
	//
	// private Boolean moveToNextPage(Map pageMap, Integer currentPage){
	// MessageFragment mf = (MessageFragment) pageMap.get(currentPage);
	// if(mf.getFirstHalfFragment().length() +
	// mf.getSecondHalfFragment().length() >= 300 )
	// return true;
	// else
	// return false;
	// }
	//
	// private Boolean moveToRight(Map pageMap, Integer currentPage){
	// MessageFragment mf = (MessageFragment) pageMap.get(currentPage);
	// if(mf.getFirstHalfFragment().length() >= 150)
	// return true;
	// return false;
	// }

	private String generateStyledText(List<String> stmtList) {
		String formattedText = "";
		for (String stmt : stmtList) {
			formattedText += wrapInBulletTag(stmt);
		}
		return formattedText;
	}

	private String wrapInBulletTag(String s) {
		// return "<li>" +s + "</li>";
		return s;
	}

	private String addNewLine(String s) {
		return s + "<br/>";
	}
}
