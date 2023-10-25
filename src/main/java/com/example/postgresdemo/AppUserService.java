package com.example.postgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService implements AppUserServiceInterface{
    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser findByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    public AppUser save(AppUser user) {
        return appUserRepository.save(user);
    }

    @Override
    public List<AppUser> findAll() {
        return appUserRepository.findAll();
    }

    public void deleteByUsername(String username) {
        AppUser user = appUserRepository.findByUsername(username);
        if (user != null) {
            appUserRepository.delete(user);
        }
    }

}


