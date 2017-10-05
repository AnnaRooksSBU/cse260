import java.util.*;

public class IterLink {
    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            ints.add(random.nextInt());
        }
        long startTime;
        long endTime;
        int temp = 0;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < ints.size(); i++) temp = ints.get(i);
        endTime = System.currentTimeMillis();
        System.out.println("get(i): " + (endTime-startTime) + "ms");

        ListIterator<Integer> iter = ints.listIterator(0);
        startTime = System.currentTimeMillis();
        while (iter.hasNext()) temp = iter.next();
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime-startTime) + "ms");
    }
}
