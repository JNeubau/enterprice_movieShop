package project.MovieShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.MovieShop.models.Genre;
import project.MovieShop.models.Movie;
import project.MovieShop.repositories.MovieRepository;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    List<Movie> getMovies() { return (List<Movie>) movieRepository.findAll(); }

    @PostMapping
    Movie createMovie(@RequestBody Movie movie) { return movieRepository.save(movie); }

    @PutMapping("/{movieId}/movie/{genreId}")
    Movie addGenreToMovie(
            @PathVariable Long movieId,
            @PathVariable Long genreId
    ) {
        Movie movie = movieRepository.get
    }

}
