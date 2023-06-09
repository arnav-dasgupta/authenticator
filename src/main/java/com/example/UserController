package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> userList = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return userList;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        userList.add(user);
        return user;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        User user = userList.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (user != null) {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
        }
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userList.removeIf(user -> user.getId().equals(id));
    }
}

