package HomeWorkLMS.Service;

import HomeWorkLMS.DB.DB;
import HomeWorkLMS.Movie.Genre;
import HomeWorkLMS.Movie.Movie;

import java.time.Year;
import java.util.List;

public class FindableImpl implements Findable{
//**********************************************************************************************************************
            DB db = new DB();
            SortableImpl sortable = new SortableImpl(db);
//**********************************************************************************************************************
    @Override
    public List<Movie> getAllMovies() {
        return db.getMovies();
    }
    @Override
    public void findMovieByNameOrPartName(String name) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            if(db.getMovies().get(i).getName().equalsIgnoreCase(name)){
                System.out.println(db.getMovies().get(i));
                find = false;
                System.out.println("🔹 Successful find movie ✅");
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by name ❗❗❗");
        }
    }

    @Override
    public void findMoviesByActorName(String actorName) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            for (int i1 = 0; i1 < db.getMovies().get(i).getActors().size(); i1++) {
                if(db.getMovies().get(i).getActors().get(i1).getFullName().equals(actorName)){
                    System.out.println(db.getMovies().get(i).getActors().get(i1));
                    find = false;
                    System.out.println("🔹 Successful find movie by name actor ✅");
                }
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by name actor ❗❗❗");
        }
    }

    @Override
    public void findMovieByYear(Year year) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            if(db.getMovies().get(i).getYear().equals(year)){
                System.out.println(db.getMovies().get(i));
                find = false;
                System.out.println("🔹 Successful find movie by year ✅");
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by year ❗❗❗");
        }
    }

    @Override
    public void findByProducer(String producerName) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            for (int i1 = 0; i1 < db.getMovies().get(i).getProducer().size(); i1++) {
                if(db.getMovies().get(i).getProducer().get(i1).getFirstName().equals(producerName)){
                    System.out.println(db.getMovies().get(i).getProducer().get(i1));
                    find = false;
                    System.out.println("🔹 Successful find movie by first name producer ✅");
                }
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by first name producer ❗❗❗");
        }
    }

    @Override
    public void findMovieByGenre(Genre genre) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            if(db.getMovies().get(i).getGenre().equals(genre)){
                System.out.println(db.getMovies().get(i));
                find = false;
                System.out.println("🔹 Successful find movie by genre ✅");
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by genre ❗❗❗");
        }
    }

    @Override
    public void findMovieByROle(String role) {
        boolean find = true;
        for (int i = 0; i < db.getMovies().size(); i++) {
            for (int i1 = 0; i1 < db.getMovies().get(i).getActors().size(); i1++) {
                if(db.getMovies().get(i).getActors().get(i1).getRole().equals(role)){
                    System.out.println(db.getMovies().get(i).getActors().get(i1));
                    System.out.println(db.getMovies().get(i));
                    find = false;
                    System.out.println("🔹 Successful find movie by role ✅");
                }
            }
        }
        if(find){
            System.out.println("‼️ Don't find this movie by role❗❗❗");
        }
    }
}
