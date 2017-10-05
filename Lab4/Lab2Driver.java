import java.util.ArrayList;

public class Lab2Driver {
    //*/
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(5);
        i.add(1);
        i.add(3);
        i.add(9);
        i.add(7);
        i.add(2);
        i.add(0);
        i.add(8);
        System.out.println(LargestInArrayList.max(i));
        SortArrayList.sort(i);
        System.out.println(i);
    }
    //*/
}
