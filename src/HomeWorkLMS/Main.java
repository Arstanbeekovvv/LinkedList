package HomeWorkLMS;

import HomeWorkLMS.Movie.Genre;
import HomeWorkLMS.Service.FindableImpl;
import HomeWorkLMS.Service.SortableImpl;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindableImpl fi = new FindableImpl();
        SortableImpl si = new SortableImpl();
        while (true){
            getCommands();
            switch (new Scanner(System.in).nextLine()){
                case "1" -> {
                    System.out.println(fi.getAllMovies());
                }
                case "2" -> {
                    System.out.print("Enter name movie or part name: ");
                    fi.findMovieByNameOrPartName(new Scanner(System.in).nextLine());
                }
                case "3" -> {
                    System.out.print("Enter name actor for find movies: ");
                    fi.findMoviesByActorName(new Scanner(System.in).nextLine());
                }
                case "4" -> {
                    System.out.print("Enter year movie: ");
                    fi.findMovieByYear(Year.of(new Scanner(System.in).nextInt()));
                }
                case "5" -> {
                    System.out.print("Enter producer name: ");
                    fi.findByProducer(new Scanner(System.in).nextLine());
                }
                case "6" -> {
                    fi.findMovieByGenre(Genre.COMEDY);
                }
                case "7" -> {
                    System.out.print("Enter role for find movie by role: ");
                    fi.findMovieByROle(new Scanner(System.in).nextLine());
                }
                case "8" -> {
                    System.out.print("Write ascending or descending: 'asc' or 'desc' -> ");
                    si.sortByMovieName(new Scanner(System.in).nextLine());
                }
                case "9" -> {
                    System.out.print("Write ascending 'A to Z' or descending 'A to Z': \n'asc' or 'desc' -> ");
                    si.sortByYear(new Scanner(System.in).nextLine());
                }
                case "10" -> {
                    System.out.print("Write ascending or descending: 'asc' or 'desc' -> ");
                    si.sortByProducer();
                }
                case "0" -> {return;}
            }
        }
    }

    public static void getCommands(){
        System.out.print("""
                🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹
                1. Get all movies
                2. Find movie by name or part mame
                3. Find movie by actor name
                4. Find movie by year
                5. Find movie by producer
                6. Find movie by genre
                7. Find movie by role
                Sortable:
                8. sortByMovieName(String ascOrDesc);
                    from A to Z
                    from Z to A
                9. sortByYear(String ascOrDesc);
                    Ascending
                    Descending
                10. sortByProducer();
                your choice: """);
    }
}
