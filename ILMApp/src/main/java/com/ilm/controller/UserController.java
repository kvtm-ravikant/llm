/*package com.ilm.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ilm.model.User;
import com.ilm.services.UserServices;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServices userServices;

	static final Logger LOGGER = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers() {

		List<User> usersList = null;
		try {
			usersList = userServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info(usersList);
		return usersList;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody User getUserByWorkEmail(@RequestParam("workmail") final String email) {

//		String email = workmail;
		List<User> user = null;
		try {
			user = userServices.findByWorkMail(email);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info(user);
		return user.get(0);
	}
}
*/