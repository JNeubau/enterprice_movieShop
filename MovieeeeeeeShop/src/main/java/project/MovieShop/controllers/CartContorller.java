package project.MovieShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.MovieShop.models.Cart;
import project.MovieShop.models.Movie;
import project.MovieShop.repositories.CartRepository;
import project.MovieShop.repositories.MovieRepository;

import java.util.List;

@Controller
public class CartContorller {
    private CartRepository cartRepository;
    private MovieRepository movieRepository;

    public CartContorller(CartRepository cartRepository, MovieRepository movieRepository) {
        this.cartRepository = cartRepository;
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/addToCart")
    public  String addToCart(@RequestParam(required = false) Long cartId,
                             @RequestParam Long movieId,
                             Model model) {
        if (cartId == null) return "redirect:/addToCart?cartId=0&movieId="+movieId;

        List<Movie> cartContents = cartRepository.getContentsOfCart(cartId);
        Cart cart = cartRepository.findById(cartId).get();
        if (!movieRepository.existsById(movieId)) {
            model.addAttribute("noMovieId", true);
        } else {
            // add movie to cart
            Movie newMovie = movieRepository.findById(movieId).get();
            newMovie.setCart(cart);
            cart.setTotal(newMovie.getPrize());
            movieRepository.save(newMovie);
            cartRepository.save(cart);
        }
//        cartContents = cartRepository.getContentsOfCart(cartId);
//        model.addAttribute("contents", cartContents);
//        model.addAttribute("cart", cart);
        return "redirect:/cart";
    }

    @RequestMapping("/cart")
    public  String viewToCart(@RequestParam(required = false) Long cartId,
                             Model model) {
        if (cartId == null) return "redirect:/cart?cartId=0";

        List<Movie> cartContents = cartRepository.getContentsOfCart(cartId);
        model.addAttribute("contents", cartContents);
        model.addAttribute("cart", cartRepository.findById(cartId).get());
        return "cartView";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(required = false) Long cartId,
                         @RequestParam Long movieId,
                         Model model) {
        if (cartId == null) return "redirect:/delete?cartId=0&movieId="+movieId;

        List<Movie> cartContents = cartRepository.getContentsOfCart(cartId);
        if (movieRepository.existsById(movieId)) {
            Movie movie = movieRepository.findById(movieId).get();
            if (cartContents.contains(movie)) {
                Cart cart = cartRepository.findById(cartId).get();
                cart.setTotal(movie.getPrize()*(-1));
                movie.setCart(null);
                movieRepository.save(movie);
                cartRepository.save(cart);
            }
        }
        return "redirect:/cart";
    }

    @RequestMapping("/finish")
    public String finishShopping(@RequestParam Long cartId,Model model) {
        List<Movie> contents = cartRepository.getContentsOfCart(cartId);
        for (Movie movie : contents) {
            movie.setCart(null);
        }
        Cart cart = cartRepository.findById(cartId).get();
        cart.resetTotal();
        return "redirect:/movies";
    }

}
