package com.sameer.fullstack.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserController {
    @GetMapping("/user-detail/{company}")
    /*http://localhost:9999/user-detail/r*/
    public String getName(@PathVariable String company) {
        return "i am user of " + company;
    }

}
