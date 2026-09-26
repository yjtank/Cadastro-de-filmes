package com.javinha.CadastroDeFilmes.movies;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public List<MovieModel> findAll() {
        return movieService.findAll();
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, im darkie";
    }

    @GetMapping("/list")
    public List<MovieModel> getMovies() {
        return movieService.findAll();
    }

    @PostMapping("/movieStore")
    public Boolean store() {
        return true;
    }

    @PutMapping("/updateMovie")
    public Boolean update() {
        return true;
    }
}
