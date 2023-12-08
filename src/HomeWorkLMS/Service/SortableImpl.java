package HomeWorkLMS.Service;

import HomeWorkLMS.DB.DB;
import HomeWorkLMS.Movie.Movie;

import java.util.LinkedList;
import java.util.Scanner;

import static HomeWorkLMS.Movie.Movie.*;

public class SortableImpl implements Sortable{
    static LinkedList<Movie> ll = new LinkedList<>();

    public SortableImpl() {
    }

    public SortableImpl(DB db) {
        this.ll = db.getMovies();
    }

    @Override
    public void sortByMovieName(String ascOrDesc) {
        if(ascOrDesc.equalsIgnoreCase("asc")){
            ll.sort(sortByMovieName);
            System.out.println("🔹 Successful sort by move name 'asc'");
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            ll.sort(sortByMovieName.reversed());
            System.out.println("🔹 Successful sort by move name 'desc'");
        }else {
            System.out.print("🔹 Enter asc or desc: ");
            sortByMovieName(new Scanner(System.in).nextLine());
        }
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        if(ascOrDesc.equalsIgnoreCase("asc")){
            ll.sort(sortByYear);
            System.out.println("🔹 Successful sort by move name 'asc'");
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            ll.sort(sortByYear.reversed());
            System.out.println("🔹 Successful sort by move name 'desc'");
        }else {
            System.out.print("🔹 Enter asc or desc: ");
            sortByMovieName(new Scanner(System.in).nextLine());
        }
    }

    @Override
    public void sortByProducer() {
        ll.sort(sortByProducer);
        System.out.println("🔹 Successful sort by producer ✅");
    }
}
