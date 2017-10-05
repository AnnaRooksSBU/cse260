import java.util.Scanner;

public class PrintingDistinctNumbers {
    public static void main(String[] args) {
        System.out.println(distinctNumbers());
    }

    public static String distinctNumbers() {
        int[] results = new int[10];
        Scanner scanner = new Scanner(System.in);
        // Takes in and inserts distinct numbers
        results[0] = scanner.nextInt();
        int insertAt = 1;
        for (int i = 1; i < 10; i++) {
            int input = scanner.nextInt();
            // Checks for duplicates
            boolean isAlreadyIn = false;
            for (int j = 0; j < i; j++) {
                if (results[j] == input) isAlreadyIn = true;
            }
            if (!isAlreadyIn) results[insertAt++] = input;
        }
        // Converts it to string
        String result = "";
        for (int i = 0; i < insertAt; i++) {
            if (i > 0) result += ", ";
            result += results[i];
        }
        return result;
    }
}
