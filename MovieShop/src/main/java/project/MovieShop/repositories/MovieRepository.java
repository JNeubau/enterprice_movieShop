package project.MovieShop.repositories;

import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import project.MovieShop.models.Genre;
import project.MovieShop.models.Movie;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    @Query("select a.id, a.title, a.description from Movie a " +
            "order by a.title")
    List<Movie> getAllMovies();

}
