package com.example.demo;

public class FormProcessor {
    public String processForm(String name, String email) {

        String result = "Name: " + name + "<br>";
        result += "Email: " + email + "<br>";

        return result;
    }
}