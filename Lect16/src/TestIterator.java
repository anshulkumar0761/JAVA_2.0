import java.util.ArrayList;
import java.util.ListIterator;  // Import ListIterator

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Forward iteration with removal
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int value = it.next();   // Call next() only once per loop
            System.out.println(value);
            if (value == 3) {
                it.remove();   // Safe removal while iterating
            }
        }

        System.out.println("After forward removal: " + list);

        // Backward iteration
        System.out.println("Backward traversal:");
        while (it.hasPrevious()) {
            int x = it.previous();   // Move backwards
            System.out.println(x);
            if (x == 4) {
                it.remove();   // Example: remove 4 while going backwards
            }
        }

        System.out.println("Final list after backward removal: " + list);
    }
}








