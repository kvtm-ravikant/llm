/*package com.ilm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ilm.model.Assessment;
import com.ilm.services.AssessmentServices;

@Controller
@RequestMapping("/assessment")
public class AssessmentController {
	
	@Autowired
	AssessmentServices assessmentServices;
	
	static final Logger LOGGER = Logger.getLogger(AssessmentController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Assessment> getAssessments() {

		List<Assessment> dataList = null;
		try {
			dataList = assessmentServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.info(dataList);
		return dataList;
	}

	@RequestMapping(value = "/byId", method = RequestMethod.GET)
	public @ResponseBody List<Assessment> getAssessmentByUserId(@RequestParam("userId") final int userId) {

		List<Assessment> dataList = null;
		try {
			dataList = assessmentServices.findByUserId(userId);

		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.info(dataList);
		return dataList;
	}
}
*/