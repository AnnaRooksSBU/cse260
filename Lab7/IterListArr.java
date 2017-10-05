import java.util.*;

public class IterListArr {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] egers = new Integer[50000];
        ArrayList<Integer> egersA = new ArrayList<Integer>();
        LinkedList<Integer> egersL = new LinkedList<Integer>();

        long startTime;
        long endTime;
        int temp = 0;

        System.out.println("Array: ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) egers[i] = random.nextInt();
        endTime = System.currentTimeMillis();
        System.out.print("Insert: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) temp = egers[i];
        endTime = System.currentTimeMillis();
        System.out.print("Traverse: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) egers[i] = 0;
        endTime = System.currentTimeMillis();
        System.out.print("Delete: " + (endTime-startTime) + "ms \n\n");


        System.out.println("ArrayList: ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) egersA.add(random.nextInt());
        endTime = System.currentTimeMillis();
        System.out.print("Insert: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) temp = egersA.get(i);
        endTime = System.currentTimeMillis();
        System.out.print("Traverse: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        while (!egersA.isEmpty()) egersA.remove(0);
        endTime = System.currentTimeMillis();
        System.out.print("Delete: " + (endTime-startTime) + "ms \n\n");


        System.out.println("LinkedList: ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) egersL.add(random.nextInt());
        endTime = System.currentTimeMillis();
        System.out.print("Insert: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < egers.length; i++) temp = egersL.get(i);
        endTime = System.currentTimeMillis();
        System.out.print("Traverse: " + (endTime-startTime) + "ms ");

        startTime = System.currentTimeMillis();
        while (!egersA.isEmpty()) egersL.removeFirst();
        endTime = System.currentTimeMillis();
        System.out.print("Delete: " + (endTime-startTime) + "ms \n\n");


    }
}
