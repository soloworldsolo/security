package com.soloworld.security.service;

import com.soloworld.security.entity.UserDetail;
import com.soloworld.security.model.User;
import com.soloworld.security.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDetailsRepository userDetailsRepository;

    public UserService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public List<User> getUsers() {
        var result = List.of(new User("solomon", 28, "India", "M"),
                new User("surya", 29, "Ireland", "M")
        );

        return result;
    }

    public List<UserDetail> getUserDetails(String email) {
        return userDetailsRepository.getUserDetailByEmail(email);
    }
}
