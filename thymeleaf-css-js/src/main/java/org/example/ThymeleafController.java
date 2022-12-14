package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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


}
