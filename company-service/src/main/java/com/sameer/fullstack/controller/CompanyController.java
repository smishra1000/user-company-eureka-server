package com.sameer.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class CompanyController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/user-detail/{company}")
    public String getUser(@PathVariable String company) {
        return template.getForObject("http://USER-SERVICE/user-service/user-detail/"+company,String.class);
    }


}
