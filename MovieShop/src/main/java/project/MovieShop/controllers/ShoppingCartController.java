package project.MovieShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.MovieShop.models.ShoppingCart;
import project.MovieShop.repositories.ShoppingCartRepository;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @GetMapping
    List<ShoppingCart> getShoppingCarts() { return (List<ShoppingCart>) shoppingCartRepository.findAll(); }

    @PostMapping
    ShoppingCart createShoppingCart(@RequestBody ShoppingCart shoppingCart) { return shoppingCartRepository.save(shoppingCart); }
}
