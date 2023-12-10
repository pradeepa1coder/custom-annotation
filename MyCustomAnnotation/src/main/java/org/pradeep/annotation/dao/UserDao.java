package org.pradeep.annotation.dao;

import org.pradeep.annotation.dto.User;
import org.pradeep.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repo;

	public User saveUser(User u) {
		return repo.save(u);
	}
}
