package solution;

/** Represents a 2d point on the plane that has two coordinates: x and y */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }

    /** Euclidian distance between this point and the other point */
    public double distance(Point other) {
        double d = Math.sqrt((other.x - x) * (other.x - x) + (other.y - y) * (other.y - y));
        return d;
    }


}
