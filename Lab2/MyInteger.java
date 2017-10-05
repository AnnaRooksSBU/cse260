public class MyInteger {
    private int value;
    // Constructor
    public MyInteger(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }
    // These methods are the same as the static ones, reduce repetition
    public boolean isEven()  { return isEven(value);  }
    public boolean isOdd()   { return !isEven(value); }
    public boolean isPrime() { return isPrime(value); }

    public static boolean isEven(int val) {
        return val % 2 == 0;
    }
    public static boolean isOdd(int val) {
        return !isEven(val);
    }
    public static boolean isPrime(int val) {
        if (val < 2) return false; // Must be larger than 2
        if (val == 2) return true; // Edge case: 2
        if (val % 2 == 0) return false;
        for (int i = 3; i*i <= val; i += 2) {
            if (val % i == 0) return false;
        }
        return true; // If not composite, is false
    }

    public boolean equals(int val) {
        return value == val;
    }
    public boolean equals(MyInteger val) {
        return value == val.getValue();
    }

    public static int parseInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int digitI = s.charAt(s.length()-(i+1)) - '0';
            result += digitI * Math.pow(10,i);
        }
        return result;
    }
}
