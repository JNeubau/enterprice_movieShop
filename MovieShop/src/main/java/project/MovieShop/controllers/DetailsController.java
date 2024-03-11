package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DetailsController {
    @RequestMapping("/details")
    public String viewMovies() {
        return "details";
    }
}
