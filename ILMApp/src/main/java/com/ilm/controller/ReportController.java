package com.ilm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ilm.dao.DemoDAO;
import com.ilm.model.Assessment;
import com.ilm.model.Suggestion;
import com.ilm.model.User;
import com.ilm.services.AssessmentServices;
import com.ilm.services.SuggestionServices;
import com.ilm.services.UserServices;

import net.sf.jasperreports.engine.JRDataSource;

/**
 * Handles and retrieves download request
 */
@Controller
@RequestMapping("/reports")
public class ReportController {

	private static final Logger LOGGER = Logger.getLogger(ReportController.class);

	@Autowired
	UserServices userServices;

	@Autowired
	AssessmentServices assessmentServices;

	@Autowired
	SuggestionServices suggestionServices;

	/**
	 * Handles and retrieves the download page
	 * 
	 * @return the name of the view page
	 */
	// @RequestMapping(value = "/download", method = RequestMethod.GET)
	@RequestMapping(value = "download", method = RequestMethod.GET)
	public String getDownloadPage() {
		LOGGER.debug("Received request to show download page");
		LOGGER.info("Received request to show download page");
		System.out.println("---------------Received request to show download page");

		// Do your work here. Whatever you like
		// i.e call a custom service to do your business
		// Prepare a model to be used by the JSP page

		// This will resolve to /WEB-INF/jsp/downloadpage.jsp
		return "downloadpage";
	}

	/**
	 * Retrieves the download file in PDF format
	 * 
	 * @return
	 */
	@RequestMapping(value = "/download/demoStatementReportPDF", method = RequestMethod.GET)
	public ModelAndView doStatementReportPDF(ModelAndView modelAndView) {
		LOGGER.debug("Received request to download PDF report");
		LOGGER.info("Received request to download PDF report");
		System.out.println("---------------Received request to download PDF report");

		// Retrieve our data from a custom data provider
		// Our data comes from a DAO layer
		// DemoDAO dataprovider = new DemoDAO();
		DemoDAO dataprovider = new DemoDAO();

		// Assign the datasource to an instance of JRDataSource
		// JRDataSource is the datasource that Jasper understands
		// This is basically a wrapper to Java's collection classes
		JRDataSource datasource = dataprovider.getDataSource();

		// In order to use Spring's built-in Jasper support,
		// We are required to pass our datasource as a map parameter
		// parameterMap is the Model of our application
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("datasource", datasource);

		// pdfReport is the View of our application
		// This is declared inside the /WEB-INF/jasper-views.xml
		modelAndView = new ModelAndView("ilm_statement_pdfReport", parameterMap);

		// Return the View and the Model combined
		return modelAndView;
	}

	/**
	 * Retrieves the download file in PDF format
	 * 
	 * @return
	 */
	@RequestMapping(value = "/download/userStatementReportPDF", method = RequestMethod.GET)
	public ModelAndView doUserStatementReportPDF(ModelAndView modelAndView,
			@RequestParam("workmail") final String email) {

		LOGGER.debug("Received request to download PDF report");
		LOGGER.info("Received request to download PDF report");

		boolean isValidUser = true;

		List<User> userList = null;
		User user = null;
		List<Assessment> assessmentList = null;
		List<Suggestion> suggestionList = null;

		userList = userServices.findByWorkMail(email);

		if (userList.isEmpty() || userList == null) {
			isValidUser = false;
		} else {
			user = userList.get(0);
		}

		if (isValidUser) {

			assessmentList = assessmentServices.findByUserId(user.getUserId());
			// suggestionList = suggestionServices.findByLvlId(1);

			List statements = suggestionServices.findUserAssessmentStatement(user.getUserId());
			// LOGGER.info("dataList "+dataList.toString());

			LOGGER.info("assessmentList " + assessmentList.toString());
			LOGGER.info("assessmentList dateData " + assessmentList.get(0).getDate());

			// Retrieve our data from a custom data provider
			// Our data comes from a DAO layer
			// DemoDAO dataprovider = new DemoDAO();
			statementReportDao dataprovider = new statementReportDao();

			// Assign the datasource to an instance of JRDataSource
			// JRDataSource is the datasource that Jasper understands
			// This is basically a wrapper to Java's collection classes
			JRDataSource datasource = dataprovider.getDataSource(user, statements, assessmentList.get(0).getDate());

			LOGGER.info("datasource " + datasource.toString());

			// In order to use Spring's built-in Jasper support,
			// We are required to pass our datasource as a map parameter
			// parameterMap is the Model of our application
			Map<String, Object> parameterMap = new HashMap<String, Object>();
			// parameterMap.put("username", user.getFirstName()+"
			// "+user.getLastName());
			parameterMap.put("datasource", datasource);

			// pdfReport is the View of our application
			// This is declared inside the /WEB-INF/jasper-views.xml
			modelAndView = new ModelAndView("ilm_statement_pdfReport", parameterMap);
		} else {
			// modelAndView.addObject("errorMessage", "No data found");
			ModelAndView mav = new ModelAndView("/404");
		}

		// Return the View and the Model combined
		return modelAndView;
	}

	/**
	 * Retrieves the report using UUID in PDF format
	 * 
	 * @return
	 */
	@RequestMapping(value = "/i", method = RequestMethod.GET)
	public ModelAndView doUniqueReport(ModelAndView modelAndView, @RequestParam("id") final String reportId) {

		LOGGER.debug("doUniqueReport : Received unique report request to download PDF report" + reportId);
		LOGGER.info("doUniqueReport : Received unique report request to download PDF report" + reportId);

		boolean isValidUser = true;

		List<User> userList = null;
		User user = null;
		List<Assessment> assessmentList = null;
		List<Suggestion> suggestionList = null;

		assessmentList = assessmentServices.findByReportId(reportId);
		LOGGER.info("assessmentList " + assessmentList.toString());
		LOGGER.info("assessmentList.get(0).getUserId() " + assessmentList.get(0).getUserId());
		userList = userServices.findByUserId(assessmentList.get(0).getUserId());
		LOGGER.info("@@@@@@@@@@@@@@userList " + userList.toString());

		if (userList.isEmpty() || userList == null) {
			isValidUser = false;
		} else {
			user = userList.get(0);
		}

		if (isValidUser) {

			List statements = suggestionServices.findUserAssessmentStatement(user.getUserId());

			LOGGER.info("assessmentList dateData " + assessmentList.get(0).getDate());
			statementReportDao dataprovider = new statementReportDao();

			JRDataSource datasource = dataprovider.getDataSource(user, statements, assessmentList.get(0).getDate());

			LOGGER.info("datasource " + datasource.toString());

			Map<String, Object> parameterMap = new HashMap<String, Object>();
			parameterMap.put("datasource", datasource);

			modelAndView = new ModelAndView("ilm_statement_pdfReport", parameterMap);
		} else {
			// modelAndView.addObject("errorMessage", "No data found");
			ModelAndView mav = new ModelAndView("/404");
		}

		return modelAndView;
	}

	/**
	 * Retrieves the download file in PDF format
	 * 
	 * @return
	 */
	@RequestMapping(value = "/download/IPMReportPDF", method = RequestMethod.GET)
	public ModelAndView doIndividualIPMReportPDF(ModelAndView modelAndView,
			@RequestParam("workmail") final String email, @RequestParam("id") final Integer assId) {

		LOGGER.debug("doIndividualIPMReportPDF : Received request to download PDF report");
		LOGGER.info("doIndividualIPMReportPDF : Received request to download PDF report");

		boolean isValidUser = true;

		List<User> userList = null;
		User user = null;
		List<Assessment> assessmentList = null;
		List<Suggestion> suggestionList = null;

		userList = userServices.findByWorkMail(email);

		if (userList.isEmpty() || userList == null) {
			isValidUser = false;
		} else {
			user = userList.get(0);
		}

		if (isValidUser) {

			assessmentList = assessmentServices.findByUserIdAssId(user.getUserId(), assId);
			// suggestionList = suggestionServices.findByLvlId(1);

			List statements = suggestionServices.findUserAssessmentStatement(user.getUserId());
			// LOGGER.info("dataList "+dataList.toString());

			LOGGER.info("assessmentList " + assessmentList.toString());
			LOGGER.info("assessmentList dateData " + assessmentList.get(0).getDate());

			// Retrieve our data from a custom data provider
			// Our data comes from a DAO layer
			// DemoDAO dataprovider = new DemoDAO();
			statementReportDao dataprovider = new statementReportDao();

			// Assign the datasource to an instance of JRDataSource
			// JRDataSource is the datasource that Jasper understands
			// This is basically a wrapper to Java's collection classes
			JRDataSource datasource = dataprovider.getDataSource(user, statements, assessmentList.get(0).getDate());

			LOGGER.info("datasource " + datasource.toString());

			// In order to use Spring's built-in Jasper support,
			// We are required to pass our datasource as a map parameter
			// parameterMap is the Model of our application
			Map<String, Object> parameterMap = new HashMap<String, Object>();
			// parameterMap.put("username", user.getFirstName()+"
			// "+user.getLastName());
			parameterMap.put("datasource", datasource);

			// pdfReport is the View of our application
			// This is declared inside the /WEB-INF/jasper-views.xml
			modelAndView = new ModelAndView("ilm_statement_pdfReport", parameterMap);
		} else {
			// modelAndView.addObject("errorMessage", "No data found");
			ModelAndView mav = new ModelAndView("/404");
		}

		// Return the View and the Model combined
		return modelAndView;
	}
}
