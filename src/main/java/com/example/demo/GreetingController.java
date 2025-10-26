package com.example.demo; 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @PostMapping("/greet")
    public String greet(@RequestParam("userName") String userName, Model model) {

        String message = "こんにちは、" + userName + "さん！ よくできましたね！";

        model.addAttribute("greetingMessage", message);

        return "greeting";
    }
}
