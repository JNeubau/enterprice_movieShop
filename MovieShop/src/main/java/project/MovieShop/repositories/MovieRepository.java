package project.MovieShop.repositories;

import org.springframework.data.repository.CrudRepository;
import project.MovieShop.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
