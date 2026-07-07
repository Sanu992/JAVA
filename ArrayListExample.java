package proj;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1, 50);

        System.out.println("ArrayList a: " + a);

        a.add(0, 67);
        System.out.println("After adding 67 at index 0: " + a);

        // Heterogeneous ArrayList (Non-Generic)
        ArrayList<Object> b = new ArrayList<Object>();

        b.add("Virat");
        b.add(14);
        b.add(5.6);
        b.add(0, 1);

        System.out.println("ArrayList b: " + b);

        // Add all elements of b into a
        a.addAll(0, Arrays.asList(100, 200)); // Example of addAll with integers
        System.out.println("After addAll(): " + a);

        // contains()
        System.out.println("Contains 10: " + a.contains(10));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 20: " + a.indexOf(20));
        System.out.println("Last Index of 20: " + a.lastIndexOf(20));

        // Sorting
        Collections.sort(a);
        System.out.println("Sorted a: " + a);

        // Reversing
        Collections.reverse(a);
        System.out.println("Reversed a: " + a);

        // String ArrayList
        ArrayList<String> d1 = new ArrayList<String>(
                Arrays.asList("Vaba", "Saavan"));

        System.out.println("d1: " + d1);

        // Remove element
        d1.remove(1);
        System.out.println("After remove(): " + d1);

        // retainAll()
        d1.retainAll(Arrays.asList("Vaba"));
        System.out.println("After retainAll(): " + d1);

        // removeAll()
        d1.removeAll(d1);
        System.out.println("After removeAll(): " + d1);
    }
}
