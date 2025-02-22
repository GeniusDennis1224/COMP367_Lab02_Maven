package com.dennis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
@RequestMapping("/")
class WelcomeController {
    @GetMapping
    public String welcome(Model model) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        String greeting = (hour < 12) ? "Good Morning" : "Good Afternoon";

        model.addAttribute("greeting", greeting);
        model.addAttribute("name", "Gang Liu");
        return "welcome";
    }
}