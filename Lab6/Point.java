public class Point implements Comparable<Point> {
    private int x;
    private int y;
    public Point(int coordX, int coordY) {
        x = coordX;
        y = coordY;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public String toString() { return "("+x+","+y+")"; }

    public int compareTo(Point p) {
        int px = p.getX();
        if (x != px) {
            return x-px;
        } else {
            return y - p.getY();
        }
    }
}
