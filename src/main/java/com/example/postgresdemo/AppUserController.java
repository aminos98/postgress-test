package com.example.postgresdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @GetMapping("/{username}")
    public AppUser findByUsername(@PathVariable String username) {
        return appUserService.findByUsername(username);
    }

    @PostMapping
    public AppUser saveUser(@RequestBody AppUser user) {
        return appUserService.save(user);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        appUserService.deleteByUsername(username);
    }

    // Implement other CRUD endpoints
}
