package me.rubeen.java.udemy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String writePage() {
        System.out.println("yep");
        return "main-menu";
    }
}
