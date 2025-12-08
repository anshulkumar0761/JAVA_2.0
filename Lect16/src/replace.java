import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class replace {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            Integer x = it.next();
            if (x==4){
                it.set(456);
            }
        }
        System.out.println(list);
    }
}
