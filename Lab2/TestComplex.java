import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first complex's real component: ");
        double xa = scanner.nextDouble();
        System.out.print("Enter first complex's imaginary component: ");
        double xb = scanner.nextDouble();
        System.out.print("Enter second complex's real component: ");
        double ya = scanner.nextDouble();
        System.out.print("Enter second complex's imaginary component: ");
        double yb = scanner.nextDouble();

        Complex x = new Complex(xa,xb);
        Complex y = new Complex(ya,yb);

        System.out.println("You entered: " + x + " and " + y);
        System.out.println("Sum = " + x.add(y));
        System.out.println("Difference = " + x.subtract(y));
        System.out.println("Product = " + x.multiply(y));
        System.out.println("Quotient = " + x.divide(y));
    }
}
