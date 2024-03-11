package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartViewController {
    @RequestMapping("/cart")
    public String viewMovies() {
        return "cartView";
    }
}
