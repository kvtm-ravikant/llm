package com.ilm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ilm.model.User;
import com.ilm.services.UserServices;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServices userServices;

	static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {

		List<User> usersList = null;
		try {
			usersList = userServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		logger.info(usersList);
		return usersList;
	}

}
