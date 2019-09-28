package com.example.aruna.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptionistResource {

    @RequestMapping("/all")
    public String sayHiToAll () {
        return "<h1> Hi Anybody...</h1>";
    }

    @RequestMapping("/user")
    public String sayHiToUser () {
        return "<h1> Hi User...</h1>";
    }

    @RequestMapping("/admin")
    public String sayHiToAdmin () {
        return "<h1> Hi Admin...</h1>";
    }
}
