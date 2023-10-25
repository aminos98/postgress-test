package com.example.postgresdemo;

public interface AppUserServiceInterface {
    AppUser findByUsername(String username);

    AppUser save(AppUser user);

    void deleteByUsername(String username);
}
