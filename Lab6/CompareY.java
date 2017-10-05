public class CompareY implements java.util.Comparator<Point> {
    public int compare(Point p1, Point p2) {
        int y1 = p1.getY();
        int y2 = p2.getY();
        if (y1 != y2) {
            return y1-y2;
        } else {
            return p1.getX() - p2.getX();
        }
    }
}
