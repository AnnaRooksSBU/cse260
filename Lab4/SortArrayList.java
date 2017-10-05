import java.util.ArrayList;

public class SortArrayList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        if (list.size() <= 1) return;
        E pivot = list.get(0);
        ArrayList<E> smaller = new ArrayList<E>();
        ArrayList<E> larger = new ArrayList<E>();
        for (int i = 1; i < list.size(); i++) {
            E e = list.get(i);
            if (e.compareTo(pivot) == 1) larger.add(e);
            else smaller.add(e);
        }
        list.clear();
        sort(smaller);
        sort(larger);
        list.addAll(smaller); list.add(pivot); list.addAll(larger);
        // System.out.println(smaller + " " + pivot + " " + larger);
    }
}
