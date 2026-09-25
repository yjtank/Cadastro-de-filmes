package com.javinha.CadastroDeFilmes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MovieController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, im darkie";
    }
}
