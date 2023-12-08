package HomeWorkLMS.DB;

import HomeWorkLMS.Movie.Genre;
import HomeWorkLMS.Movie.Movie;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

public class DB {
    //****************************     SET MOVIE   *********************************************************************
    private LinkedList<Movie> movies = new LinkedList<>(List.of(
            new Movie("Hacker", Year.of(2016), Genre.THRILLER),
            new Movie("Джамилия", Year.of(1969), Genre.ROMANCE),
            new Movie("Салам Нью-Йорк", Year.of(2013), Genre.COMEDY_DRAMA),
            new Movie("В поисках мамы", Year.of(2017), Genre.COMEDY_DRAMA),
            new Movie("Салам, Европа!", Year.of(2023), Genre.COMEDY),
            new Movie("Напарники", Year.of(2019), Genre.COMEDY),
            new Movie("Полчан", Year.of(2019), Genre.COMEDY),
            new Movie("Кошбой", Year.of(2019), Genre.COMEDY_DRAMA),
            new Movie("Бир Тууганчик", Year.of(2019), Genre.DRAMA),
            new Movie("Супер кудалап", Year.of(2019), Genre.ROMANCE_COMEDY)
    ));
//**********************************************************************************************************************
    public LinkedList<Movie> getMovies() {
        return movies;
    }
    public void setMovies(LinkedList<Movie> movies) {
        this.movies = movies;
    }
//**********************************************************************************************************************

}
