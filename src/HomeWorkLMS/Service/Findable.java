package HomeWorkLMS.Service;

import HomeWorkLMS.Movie.Genre;
import HomeWorkLMS.Movie.Movie;

import java.time.Year;
import java.util.List;

public interface Findable {
    List<Movie> getAllMovies();
    void findMovieByNameOrPartName(String name);
    void findMoviesByActorName(String actorName);
    void findMovieByYear(Year year);
    void findByProducer(String producerName);
    void findMovieByGenre(Genre genre);
    void findMovieByROle(String role);
}
