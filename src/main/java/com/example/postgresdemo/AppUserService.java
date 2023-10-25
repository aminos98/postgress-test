package com.example.postgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser findByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    public AppUser save(AppUser user) {
        return appUserRepository.save(user);
    }

    public void deleteByUsername(String username) {
        AppUser user = appUserRepository.findByUsername(username);
        if (user != null) {
            appUserRepository.delete(user);
        }
    }

}


