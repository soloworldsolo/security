package com.soloworld.security.service;

import com.soloworld.security.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        var result = List.of(new User("solomon", 28, "India", "M"),
                new User("surya", 29, "Ireland", "M")
        );

        return result;
    }
}
