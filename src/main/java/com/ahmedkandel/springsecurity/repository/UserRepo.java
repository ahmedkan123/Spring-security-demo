package com.ahmedkandel.springsecurity.repository;

import java.util.Optional;

import com.ahmedkandel.springsecurity.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUserName (String userName) ;

}