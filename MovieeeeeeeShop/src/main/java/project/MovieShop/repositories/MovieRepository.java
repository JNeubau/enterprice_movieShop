package project.MovieShop.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import project.MovieShop.models.Movie;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    @Query("select a from Movie a " +
            "where a.category LIKE %:cat% " +
            "order by a.id")
    List<Movie> getMoviesByCategory(@Param("cat") String cat);
}
