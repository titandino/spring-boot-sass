package springtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
    @GetMapping("/dicks")
    public String getOnlinePlayers() {
        return "dicks";
    }
}