package project.MovieShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.MovieShop.models.Movie;
import project.MovieShop.repositories.MovieRepository;

import java.util.Arrays;
import java.util.List;

@Controller
public class ViewMoviesController {
    @RequestMapping("/view")
    public String viewMovies(Model model) {
//        model.addAttribute("movies", Arrays.asList(
//                new Movie("Some title 2")
//        ))
        return "viewMovies";
    }

}
