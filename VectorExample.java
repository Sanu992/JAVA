package proj;
import java.util.*;

public class VectorExample {

    public static void main(String[] args) {

        // Integer Vector
        Vector<Integer> a = new Vector<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1, 50);

        System.out.println("Vector a: " + a);

        a.add(0, 67);
        System.out.println("After adding 67 at index 0: " + a);

        // Heterogeneous Vector
        Vector<Object> b = new Vector<Object>();

        b.add("Virat");
        b.add(14);
        b.add(5.6);
        b.add(0, 1);

        System.out.println("Vector b: " + b);

        // addAll()
        a.addAll(0, Arrays.asList(100, 200));
        System.out.println("After addAll(): " + a);

        // contains()
        System.out.println("Contains 10: " + a.contains(10));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 20: " + a.indexOf(20));
        System.out.println("Last Index of 20: " + a.lastIndexOf(20));

        // Sorting
        Collections.sort(a);
        System.out.println("Sorted a: " + a);

        // Reverse
        Collections.reverse(a);
        System.out.println("Reversed a: " + a);

        // String Vector
        Vector<String> d1 = new Vector<String>(
                Arrays.asList("Vaba", "Saavan"));

        System.out.println("d1: " + d1);

        d1.remove(1);
        System.out.println("After remove(): " + d1);

        d1.retainAll(Arrays.asList("Vaba"));
        System.out.println("After retainAll(): " + d1);

        d1.removeAll(d1);
        System.out.println("After removeAll(): " + d1);
    }
}

