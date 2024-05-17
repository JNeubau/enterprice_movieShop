package project.MovieShop.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import project.MovieShop.models.Cart;
import project.MovieShop.models.Movie;

import java.time.LocalDate;
import java.util.List;

public interface CartRepository extends CrudRepository<Cart, Long> {
    @Query("select a.contents from Cart a join a.contents c " +
            "where a.id = :cartId " +
            "order by c.id")
    List<Movie> getContentsOfCart(@Param("cartId") Long cartId);
}
