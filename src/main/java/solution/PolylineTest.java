package solution;

import java.util.Iterator;

public class PolylineTest {
    public static void main(String[] args) {
        Polyline polyline1 = new Polyline();
        Polyline polyline2 = new Polyline();

        // Add several points to polyline1 and polyline2 (make up some x, y coordinates)
        polyline1.addPoint(10, 10);
        polyline1.addPoint(20, 50);
        polyline1.addPoint(100, 300);

        // Iterate over points of polyline1
        Iterator<Point> it1 = polyline1.iterator();
        while (it1.hasNext())
            System.out.println(it1.next());

        // Create polyline 2
        polyline2.addPoint(0, 1);
        polyline2.addPoint(1, 1);
        polyline2.addPoint(4, 4);
        polyline2.addPoint(4, 8);
        polyline2.addPoint(8, 9);

        System.out.println(polyline1.length());
        System.out.println(polyline2.length());

        // compare them based on the total length, print which one is "smaller"
        System.out.println(polyline1.compareTo(polyline2));
    }
}
