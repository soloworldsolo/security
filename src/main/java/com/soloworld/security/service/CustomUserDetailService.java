package com.soloworld.security.service;

import com.soloworld.security.config.CustomDetails;
import com.soloworld.security.entity.UserDetail;
import com.soloworld.security.repository.UserDetailsRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserDetailsRepository userDetailsRepository;

    public CustomUserDetailService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        try {
            List<UserDetail> userDetailList = userDetailsRepository.getUserDetailByEmail(email);
            if (userDetailList == null || userDetailList.isEmpty()) {
                throw new UsernameNotFoundException("user is not found in database");
            }
            return new CustomDetails(userDetailList.get(0));
        } catch (Exception e) {
            throw new UsernameNotFoundException(e.getMessage());
        }
    }
}
