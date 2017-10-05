public class TestMyInteger {
    public static void main(String[] args) {
        String print = "";
        for (int i = 1; i <= 10; i++) {
            MyInteger mint = new MyInteger(i);
            print += "MyInteger "+mint.getValue()+" is:";
            if (mint.isPrime()) print += " Prime and";
            if (mint.isOdd()) print += " Odd";
            if (mint.isEven()) print += " Even";
            print += "\nDoes "+mint.getValue()+" equal itself?";
            print += " "+mint.equals(mint)+"\n";

            print += "Integer "+i+" is";
            if (MyInteger.isPrime(i)) print += " Prime and";
            if (MyInteger.isOdd(i)) print += " Odd";
            if (MyInteger.isEven(i)) print += " Even";
            print += "\nDoes MyInteger "+mint.getValue()+" equal int?";
            print += " "+mint.equals(i)+"\n";

            System.out.println(print);
            print = "";
        }
    }
}
