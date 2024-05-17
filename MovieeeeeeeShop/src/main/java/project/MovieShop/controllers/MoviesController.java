package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.MovieShop.repositories.MovieRepository;

@Controller
public class MoviesController {
    private MovieRepository movieRepository;

    public MoviesController(MovieRepository movieRepository) { this.movieRepository = movieRepository; }

    @RequestMapping("/movi")
    public String showMovies(@RequestParam(required = false) String name, Model model) {
//        model.addAttribute("name", name);
        return "details";
    }

    @RequestMapping("/movies")
    public  String showMovieById(Model model) {
        model.addAttribute("all", movieRepository.findAll());
        return "movies";
    }

    @RequestMapping("movies/details")
    public  String showDetailsById(@RequestParam Long id, Model model) {
        if (movieRepository.existsById(id)) {
            model.addAttribute("movie", movieRepository.findById(id).get());
        }
        return "details";
    }

    @RequestMapping("/moviesCat")
    public String showByCategory(@RequestParam String category, Model model) {
        model.addAttribute("all", movieRepository.getMoviesByCategory(category.toUpperCase()));
        return "movies";
    }
}
