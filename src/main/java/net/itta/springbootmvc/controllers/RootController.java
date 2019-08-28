package net.itta.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RootController {
    
    @GetMapping("/")
    public String Home(){
        return "sweethome";
    }
    
}
