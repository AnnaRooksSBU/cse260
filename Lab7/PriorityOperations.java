import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityOperations {
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>(Arrays.asList(
                    "George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> q2 = new PriorityQueue<>(Arrays.asList(
                    "George", "Katie", "Kevin", "Michelle", "Ryan"));
        System.out.println("Queue 1: " + q1.toString());
        System.out.println("Queue 2: " + q2.toString());

        PriorityQueue<String> union = new PriorityQueue<>(q1);
        union.removeAll(q2);
        union.addAll(q2);
        System.out.println("Union: " + union.toString());

        PriorityQueue<String> difference = new PriorityQueue<>(q1);
        difference.removeAll(q2);
        System.out.println("Difference: " + difference.toString());

        PriorityQueue<String> intersection = new PriorityQueue<>(q1);
        intersection.retainAll(q2);
        System.out.println("Intersection: " + intersection.toString());
    }
}
