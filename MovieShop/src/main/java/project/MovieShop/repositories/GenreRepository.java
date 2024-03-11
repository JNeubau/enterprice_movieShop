package project.MovieShop.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import project.MovieShop.models.Genre;
import project.MovieShop.models.Movie;

import java.time.LocalDate;
import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    @Query("select a from Genre a " +
            "order by a.name")
    List<Genre> getAllGenres();

//    @Query("select a from Movie a " +
//            "where a.genres >= :numGuests and " +
//            "not exists (select b from a.bookings b " +
//            " where :startDay < b.toDate and :endDay > b.fromDate) " +
//            "order by a.capacity")
//    List<Movie> getMoviesWithGenre(@Param("genreName") Integer genreName,
//                                   @Param("startDay") LocalDate startDay,
//                                   @Param("endDay") LocalDate endDay);
}
