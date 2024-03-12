package dk.kea.gruppe5_madspild.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

}
