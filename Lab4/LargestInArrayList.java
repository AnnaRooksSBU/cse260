import java.util.ArrayList;

public class LargestInArrayList {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E currentMax = list.get(1);
        for (int i = 1; i < list.size(); i++) {
            E e = list.get(i);
            if (e.compareTo(currentMax) > 0) currentMax = e;
        }
        return currentMax;
    }
}
