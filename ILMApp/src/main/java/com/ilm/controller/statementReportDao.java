package com.ilm.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ilm.model.User;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class statementReportDao {
	
	/**
	 * Our dummy datasource. Retrieves a collection of data that is wrapped by a JRBeanCollectionDataSource.
	 *  
	 * @return a JRBeanCollectionDataSource collection
	 */
	public  JRDataSource getDataSource(User u) {
		// Create an array list of DemoModal 
		List<statementReportModel> items = new ArrayList<statementReportModel>();
		
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
		
//		String formattedDate = new SimpleDateFormat("yyyyMMdd").format(u.getDtCompleted());
		stData.setDtCompleted(u.getDtCompleted());		
		
		items.add(stData);
		
		// Wrap the collection in a JRBeanCollectionDataSource
		// This is one of the collections that Jasper understands
		JRDataSource ds = new JRBeanCollectionDataSource(items);	
		
		// Return the wrapped collection
		return ds;
	}




}
