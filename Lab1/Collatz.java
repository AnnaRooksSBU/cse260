public class Collatz {
    public static void main(String[] args) {
        System.out.println(howManyCollatzIterations(Integer.parseInt(args[0])));
    }
    public static int howManyCollatzIterations(int n) {
        int iterations = 0;
        // Iterates and counts
        while (n != 1) {
            n = (n%2 == 0)? n / 2 : 3*n+1;
            iterations++;
        }
        return iterations;
    }
}
