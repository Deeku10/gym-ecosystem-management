package in.bydeepak.authservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
