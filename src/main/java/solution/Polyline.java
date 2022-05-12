package solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Represents a polyline that is defined by a list of 2d points */
public class Polyline implements Comparable<Polyline> { // implement comparable so that Polylines are compared by the total length
    private List<Point> points;  // stores points in an ArrayList

    public Polyline() {
        points  = new ArrayList<>();
    }

    public void addPoint(int x, int y) {
        // FILL IN CODE: create a point with (x, y) coordinates and add it to the list of points
        Point p = new Point(x, y);
        points.add(p);
    }

    public double length() {
        double totalLength = 0;
       // FILL IN CODE: compute the total length of all segments in the polyline
        if (points.size() < 2)
            return 0; //  no points or 1 point, no line.
        Point prev = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            Point curr = points.get(i);
            double distance = prev.distance(curr); // distance between prev and curr
            totalLength += distance;
            prev = curr;
        }
        return totalLength;
    }

    public Iterator<Point> iterator() {
        return points.iterator();
    }

    @Override
    public int compareTo(Polyline o) {
        double res = this.length() - o.length();
        if (Math.abs(res) < 0.001)
            return 0;
        else
            if (res < 0)
                return -1;
            else
                return 1;
    }

}
