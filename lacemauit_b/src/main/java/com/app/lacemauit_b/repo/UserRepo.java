package com.app.lacemauit_b.repo;

import com.app.lacemauit_b.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<User, String>{

    User getUserById(String id);
}
