package sample1.message.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
    @GetMapping("/")
    public String welcome() {
        return "Welcome user Thank you for visiting";
    }
}
