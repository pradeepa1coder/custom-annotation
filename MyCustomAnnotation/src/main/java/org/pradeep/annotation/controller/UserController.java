package org.pradeep.annotation.controller;

import org.pradeep.annotation.dto.User;
import org.pradeep.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService ser;

	@PostMapping("/saveuser")
	public User saveUser(@RequestBody @Valid User u) {
		return ser.saveUser(u);
	}
}
