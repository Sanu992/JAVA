package proj;
import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        // Integer LinkedList
        LinkedList<Integer> a = new LinkedList<Integer>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1, 50);

        System.out.println("LinkedList a: " + a);

        a.add(0, 67);
        System.out.println("After adding 67 at index 0: " + a);

        // Heterogeneous LinkedList
        LinkedList<Object> b = new LinkedList<Object>();

        b.add("Virat");
        b.add(14);
        b.add(5.6);
        b.add(0, 1);

        System.out.println("LinkedList b: " + b);

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

        // String LinkedList
        LinkedList<String> d1 = new LinkedList<String>(
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

