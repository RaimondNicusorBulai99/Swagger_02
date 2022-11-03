package swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefoultController {

    @GetMapping
    public String welcome() {
        return "Welcome";
    }
}