package com.ilm.dao;

import java.util.ArrayList;
import java.util.List;

import com.ilm.model.DemoModal;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class DemoDAO {
	
	/**
	 * Our dummy datasource. Retrieves a collection of data that is wrapped by a JRBeanCollectionDataSource.
	 *  
	 * @return a JRBeanCollectionDataSource collection
	 */
	public  JRDataSource getDataSource() {
		// Create an array list of DemoModal 
		List<DemoModal> items = new ArrayList<DemoModal>();
		
		// We'll add three DemoModal items
		// You can populate data from a custom JDBC or DAO layer
		// For this demo, we'll create an in-memory list of items
		
		// Create first item
		DemoModal item1 = new DemoModal();
		item1.setId(1L);
		item1.setName("Angular");
		item1.setDescription("It is used for UI Client.");
//		item1.setPrice(10.50);
		
		// Create second item
		DemoModal item2 = new DemoModal();
		item2.setId(2L);
		item2.setName("Spring MVC");
		item2.setDescription("It is used for server technology.");
		
		// Create third item
		DemoModal item3 = new DemoModal();
		item3.setId(3L);
		item3.setName("Jasper");
		item3.setDescription("It is used for reporting.");
	
		// Create fourth item
		DemoModal item4 = new DemoModal();
		item4.setId(4L);
		item4.setName("Gradle");
		item4.setDescription("It is used for build process.");
	
		
		// Add to list
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		
		// Wrap the collection in a JRBeanCollectionDataSource
		// This is one of the collections that Jasper understands
		JRDataSource ds = new JRBeanCollectionDataSource(items);	
		
		// Return the wrapped collection
		return ds;
	}


}
