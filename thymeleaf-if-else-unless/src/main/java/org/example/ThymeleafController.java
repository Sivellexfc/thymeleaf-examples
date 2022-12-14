package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("text","Thymeleaf");
        return "hello";
    }

    @GetMapping("/style")
    public String style(){
        return "js-css";
    }

    @GetMapping("/bootstrap")
    public String boot(){
        return "bootstrap";
    }

    @GetMapping("/users")
    public String users(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User("Musluhan","mhancavus@gmail.com","ADMIN"));
        users.add(new User("Ahmet","ahmet@gmail.com","STANDART"));
        users.add(new User("Mert","mert@gmail.com","STANDART"));
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("/sw")
    public String switchCase(Model model){
        User user = new User("Musluhan","mhancavus@gmail.com","STANDART");
        model.addAttribute("user",user);
        return"switch-case";
    }

}
