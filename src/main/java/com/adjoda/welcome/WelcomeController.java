package com.adjoda.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @GetMapping
    public String applicationStatus(){
        return "Application is up and running !";
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return String.format("Hi, %s welcome to ADJODA dev AWS ECS Example", name);
    }
}
