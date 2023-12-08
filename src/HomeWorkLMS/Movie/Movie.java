package HomeWorkLMS.Movie;

import java.time.Year;
import java.util.Comparator;
import java.util.LinkedList;

public class Movie {
    private String name;
    private Year year;
    private Genre genre;
    private LinkedList<Producer> producer = new LinkedList<>();
    private LinkedList<Actor> actors = new LinkedList<>();
//*********************************************************************************************************************
    public Movie() {
    }
    public Movie(String name, Year year, Genre genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }
//*********************************************************************************************************************
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Year getYear() {
        return year;
    }
    public void setYear(Year year) {
        this.year = year;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public LinkedList<Producer> getProducer() {
        return producer;
    }
    public void setProducer(LinkedList<Producer> producer) {
        this.producer = producer;
    }
    public LinkedList<Actor> getActors() {
        return actors;
    }
    public void setActors(LinkedList<Actor> actors) {
        this.actors = actors;
    }
//*********************************************************************************************************************
    @Override
    public String toString() {
        return "Movie: \n" +
                "\nname = " + name + '\'' +
                "\nyear = " + year +
                "\ngenre = " + genre +
                "\nproducer = " + producer +
                "\nactors = " + actors +
                '}';
    }
//*********************************************************************************************************************
                                //  SORT MOVIE BY NAME, YEAR, PRODUCER
    public static Comparator<Movie> sortByMovieName = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
    public static Comparator<Movie> sortByYear = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
    public static Comparator<Movie> sortByProducer = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
//*********************************************************************************************************************
}
