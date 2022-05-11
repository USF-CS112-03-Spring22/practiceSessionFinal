package problems.objectOrientedProgramming;

import java.util.Iterator;
import java.util.List;

/** Represents a polyline that is defined by a list of 2d points */
public class Polyline  { // implement comparable so that Polylines are compared by the total length
    private List<Point> points;  // stores points in an ArrayList

    public Polyline() {
        // FILL IN CODE: initialize the points ArrayList

    }

    public void addPoint(int x, int y) {
        // FILL IN CODE: create a point with (x, y) coordinates and add it to the list of points

    }

    public double length() {
        double s = 0;
       // FILL IN CODE: compute the total length of all segments in the polyline

        return s;
    }

    public Iterator<Point> iterator() {
        // FILL IN CODE: return an iterator over points of this polyline
        // Hint: use the iterator method in class ArrayList

        return null;
    }
    // FILL IN CODE: add a compareTo method that compares polylines based on the total length








}
