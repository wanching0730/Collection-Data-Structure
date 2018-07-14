import java.util.Arrays;
import java.util.Comparator;

public class SortedPoints {

    // inner class have to be static
    static class Point implements Comparable<Point> {
        double x, y;

        Point() {
            this.x = this.y = 0.0;
        }

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo (Point p2) {
            if(this.x < p2.x) {
                return -1;
            } else if(this.x > p2.x)
                return 1;
            else {
                if (this.y < p2.y)
                    return -1;
                else if (this.y > p2.y)
                    return 1;
                else
                    return 0;
            }
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class CompareY implements Comparator<Point> {
        public int compare (Point p1, Point p2) {
            if(p1.y < p2.y)
                return -1;
            else if(p1.y > p2.y)
                return 1;
            else {
                if (p1.x < p2.x)
                    return -1;
                else if (p1.x > p2.x)
                    return 1;
                else
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        Point[] points = new Point[10];
        for(int i = 0; i < points.length; i++)
            points[i] = new Point(Math.random() * 100, Math.random() * 100);

        System.out.println("sort on x coordinate");
        // sort the specified list with default Comparable
        Arrays.sort(points);
        for(Point e: points)
            System.out.println(e);

        System.out.println("sort on y coordinate");
        // sort the specified list with comparator
        Arrays.sort(points, new CompareY());
        for(Point e: points)
            System.out.println(e);
    }
}
