package Task2;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aliaskar", 22);
        Student student2 = new Student("Jigit", 21);
        Student student3 = new Student("Zaripbek", 20);
        Student student4 = new Student("Mugtar", 23);
        Student student5 = new Student("Nurtilek", 24);
        LinkedList<Student> linkedList = new LinkedList<>(List.of(student1,student2,student3,student4,student5));
        SortByAge sortByAge = new SortByAge();
//        Collections.sort(linkedList);
        linkedList.sort(new SortByAge());
        System.out.println(linkedList);
    }

}
