package com.techlabs.conference.controller;

import com.techlabs.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(
            @RequestParam(value = "firstname", defaultValue = "Venura") String firstname ,
            @RequestParam(value = "lastname", defaultValue = "Rajapaksha") String lastname ,
            @RequestParam(value = "age", defaultValue = "21") int age) {
        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname:" + user.getFirstName());

        return user;
    }


}
