package org.pradeep.annotation.service;

import org.pradeep.annotation.dao.UserDao;
import org.pradeep.annotation.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public User saveUser(User u) {
		return dao.saveUser(u);
	}
}
