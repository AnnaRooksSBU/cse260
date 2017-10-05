public class MyPoint {
    private double x;
    private double y;
    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        double dx = x - p.getX();
        double dy = y - p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distance(double otherX, double otherY) {
        double dx = x - otherX;
        double dy = y - otherY;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
