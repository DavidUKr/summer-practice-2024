package com.app.lacemauit_b.service;

import com.app.lacemauit_b.module.User;
import com.app.lacemauit_b.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public User getUserById(String id){
        return userRepo.getUserById(id);
    }

    public void createUser(User user) {
        userRepo.save(user);
    }
}
