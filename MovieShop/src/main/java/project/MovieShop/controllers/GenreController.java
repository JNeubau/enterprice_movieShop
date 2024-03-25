package project.MovieShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.MovieShop.models.Genre;
import project.MovieShop.repositories.GenreRepository;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    GenreRepository genreRepository;

    @GetMapping
    List<Genre> getGenres() { return genreRepository.getAllGenres(); }

    @PostMapping
    Genre createGenre(@RequestBody Genre genre) { return genreRepository.save(genre); }

}
