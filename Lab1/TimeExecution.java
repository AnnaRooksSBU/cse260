import java.util.Random;
import java.util.Arrays;

public class TimeExecution {
    public static void main(String[] args) {
        int ARRAY_SIZE = 10000;
        // Generates ARRAY_SIZE random integers and a key from the array
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) array[i] = random.nextInt();
        int key = array[random.nextInt(ARRAY_SIZE)];
        System.out.println(executeTimes(array,key));
    }

    public static String executeTimes(int[] array,int key) {
        String result = "";
        long startTime;
        long endTime;
        result += "Linear search returned: ";
        startTime = System.currentTimeMillis();
        result += linearSearch(array,key);
        endTime = System.currentTimeMillis();
        result += " in " + (endTime - startTime) + "ms\n";

        Arrays.sort(array);
        result += "Binary search returned: ";
        startTime = System.currentTimeMillis();
        result += binarySearch(array,key);
        endTime = System.currentTimeMillis();
        result += " in " + (endTime - startTime) + "ms";
        return result;
    }
    public static int binarySearch(int[] array,int key) {
        int low = 0;
        int high = array.length-1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) high = mid - 1;
            else if (key == array[mid]) return mid;
            else low = mid + 1;
        }
        return -1;
    }
    public static int linearSearch(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
}
