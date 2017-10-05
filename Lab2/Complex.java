public class Complex {
    private double a;
    private double b;

    public Complex() {
        a = 0;
        b = 0;
    }
    public Complex(double newA) {
        a = newA;
        b = 0;
    }
    public Complex(double newA, double newB) {
        a = newA;
        b = newB;
    }


    public double getRealPart() {
        return a;
    }
    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex c) {
        return new Complex(a + c.getRealPart(),
                       b + c.getImaginaryPart());
    }
    public Complex subtract(Complex c) {
        return new Complex(a - c.getRealPart(),
                       b - c.getImaginaryPart());
    }

    public Complex multiply(Complex c) {
        return new Complex(a*c.getRealPart() - b*c.getImaginaryPart(),
                           b*c.getRealPart() - a*c.getImaginaryPart());
    }

    public Complex divide(Complex c) {
        double resultReal = ((a*c.getRealPart() + b*c.getImaginaryPart()) /
                             (Math.pow(c.getRealPart(),2) + Math.pow(c.getImaginaryPart(),2)));
        double resultImaginary = ((b*c.getRealPart() - a*c.getImaginaryPart()) /
                                  (Math.pow(c.getRealPart(),2) + Math.pow(c.getImaginaryPart(),2)));
        return new Complex(resultReal, resultImaginary);
    }
    
    public String toString() {
        boolean a0 = (a==0);
        boolean b0 = (b==0);
        if (a0 && b0) return "(0)";
        return "(" + (a0     ? "" : ""+a) 
                   + (a0||b0 ? "" : "+")
                   + (b0     ? "" : ""+b+"i") + ")";
    }
}
