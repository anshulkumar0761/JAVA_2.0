import java.util.ArrayList;
import java.util.ListIterator;

public class array_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(32);
        list.add(45);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        // Find the middle index
        int midIndex = list.size() / 2;

        // Create a ListIterator starting at the middle index
        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()){
            int x = it.next();
            System.out.println(x);
            if (x==midIndex){
                break;
            }
        }
        while (it.hasPrevious()){
            while (it.hasPrevious()) {
                int y = it.previous();   // Move backwards
                System.out.println(y);
        }
    }
}}