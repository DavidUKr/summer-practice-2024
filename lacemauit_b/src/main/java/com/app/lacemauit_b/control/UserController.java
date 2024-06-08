package com.app.lacemauit_b.control;

import com.app.lacemauit_b.module.Movie;
import com.app.lacemauit_b.module.User;
import com.app.lacemauit_b.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lcmu/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getAllMovies(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping(value="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
