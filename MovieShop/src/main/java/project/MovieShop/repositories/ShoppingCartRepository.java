package project.MovieShop.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import project.MovieShop.models.ShoppingCart;

import java.time.LocalDate;
import java.util.List;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
}
