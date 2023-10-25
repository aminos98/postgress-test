package com.example.postgresdemo;

import java.util.List;

public interface AppUserServiceInterface {
    AppUser findByUsername(String username);

    AppUser save(AppUser user);
    List<AppUser> findAll();

    void deleteByUsername(String username);
}
