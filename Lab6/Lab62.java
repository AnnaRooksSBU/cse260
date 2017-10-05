import java.util.LinkedList;
import java.util.Collections;

public class Lab62 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        int tempNum = 0;
        for (String arg : args) {
            try {
                tempNum = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Not all numbers, exiting...");
                return;
            }
            if (!numbers.contains(tempNum)) numbers.add(tempNum);
        }
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers.toString());

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers.toString());

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers.toString());
    }

}
