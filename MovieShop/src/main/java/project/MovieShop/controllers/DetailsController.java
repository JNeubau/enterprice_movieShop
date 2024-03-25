package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.MovieShop.models.Movie;

import java.util.List;

@Controller
public class DetailsController {
    @RequestMapping("/details")
    public String viewMovies(@RequestParam() int id,
                             Model model) {
        String description = "Some description";
        String title = "Something Title";
        model.addAttribute("id", id);
        model.addAttribute("title", title);
        model.addAttribute("description", description);

        return "details";
    }
}
