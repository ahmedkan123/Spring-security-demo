package com.ahmedkandel.springsecurity.service;

import com.ahmedkandel.springsecurity.entity.AppUser;
import com.ahmedkandel.springsecurity.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;


    public List<AppUser> findAll() {

        return userRepo.findAll();
    }

    public AppUser findById(Long id) {

        return userRepo.findById(id).orElse(null);
    }

    public AppUser save(AppUser entity) {
//        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return userRepo.save(entity);
    }
}