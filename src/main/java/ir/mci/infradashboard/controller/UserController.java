package ir.mci.infradashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    
    @GetMapping({"/index"})
    public String returnIndexPage() {
        return "index.html";
    }

    
    
    
    

}
