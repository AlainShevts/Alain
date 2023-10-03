package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/index")
    public String showUserList() {
        return "index";
    }

    @GetMapping("/adduser")
    public String addUser() {
        return "add-user";
    }

    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") long id) {
        return "update " + id;
    }

    @GetMapping("/delete")
    public String deleteUser() {
        return "delete";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id) {
        return "edit " + id;
    }
}