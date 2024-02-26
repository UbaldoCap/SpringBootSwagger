package com.example.demoSwagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class HomeController {
    @Operation(summary = "return name")
    @GetMapping
    public String name(@RequestParam String name) {
        return name;
    }

    @Operation(summary = "return name in reverse")
    @PostMapping
    public StringBuilder nameRev(@RequestParam String name) {
        StringBuilder nameRev = new StringBuilder();
        for (int index = 1; index < name.length() + 1; index++) {
            nameRev.append(name.charAt(name.length() - index));
        }
        return nameRev;
    }
}
