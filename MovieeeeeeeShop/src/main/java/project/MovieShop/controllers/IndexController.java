package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(@RequestParam(required = false) String name, Model model) {
        if (name == null || name.strip().equals(""))
            name = "Anonymous";
        model.addAttribute("name", name);
        return "index";
    }
}
