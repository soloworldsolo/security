package com.soloworld.security.repository;

import com.soloworld.security.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetail,Integer> {

    List<UserDetail> getUserDetailByEmail(String email);
}
