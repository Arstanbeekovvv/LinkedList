import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(new Random().nextInt(50));
        }
        LinkedList<Integer> jup = new LinkedList<>();
        LinkedList<Integer> tak = new LinkedList<>();
        Iterator it = ll.iterator();
        while (it.hasNext()){
            Integer num = (Integer) it.next();
            if(num % 2 == 0){
                jup.add(num);
            }else tak.add(num);

        }

        Collections.sort(tak);
        Collections.sort(jup);
        System.out.println("Jup"+jup);
        System.out.println("Tak"+tak);

    }
}