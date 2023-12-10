package org.pradeep.annotation.repository;

import org.pradeep.annotation.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
