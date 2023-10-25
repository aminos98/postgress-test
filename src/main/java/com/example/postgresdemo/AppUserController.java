package com.example.postgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AppUserController {
    @Autowired
    private AppUserServiceInterface appUserService;

    @GetMapping("/get/{username}")
    public AppUser findByUsername(@PathVariable String username) {
        return appUserService.findByUsername(username);
    }

    @PostMapping
    public AppUser saveUser(@RequestBody AppUser user) {
        return appUserService.save(user);
    }

    @DeleteMapping("/delete/{username}")
    public void deleteUser(@PathVariable String username) {
        appUserService.deleteByUsername(username);
    }

    @GetMapping("/getAll")
    public List<AppUser> findAll() {
        return appUserService.findAll();
    }

}
