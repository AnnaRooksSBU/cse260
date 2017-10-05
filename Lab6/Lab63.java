import java.util.Random;
import java.util.Arrays;

public class Lab63 {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
        Random random = new Random();
        Point[] arr = new Point[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = new Point(random.nextInt(100), random.nextInt(100));
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new CompareY());
        System.out.println(Arrays.toString(arr));
    }
}
