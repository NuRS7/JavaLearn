package segments;

public class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start.equals(end)) {
            throw new IllegalArgumentException("Segment cannot be degenerative (start and end are the same)");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public Point middle() {
        return new Point((start.getX() + end.getX()) / 2.0, (start.getY() + end.getY()) / 2.0);
    }

    public Point intersection(Segment another) {
        double A1 = this.end.getY() - this.start.getY();
        double B1 = this.start.getX() - this.end.getX();
        double C1 = A1 * this.start.getX() + B1 * this.start.getY();

        double A2 = another.end.getY() - another.start.getY();
        double B2 = another.start.getX() - another.end.getX();
        double C2 = A2 * another.start.getX() + B2 * another.start.getY();

        double determinant = A1 * B2 - A2 * B1;

        if (determinant == 0) {
            return null; // Линии параллельны или совпадают
        }

        double x = (C1 * B2 - C2 * B1) / determinant;
        double y = (A1 * C2 - A2 * C1) / determinant;

        Point intersectionPoint = new Point(x, y);

        if (isPointOnSegment(intersectionPoint, this) && isPointOnSegment(intersectionPoint, another)) {
            return intersectionPoint;
        }

        return null;
    }

    private boolean isPointOnSegment(Point p, Segment s) {
        return Math.min(s.start.getX(), s.end.getX()) <= p.getX() && p.getX() <= Math.max(s.start.getX(), s.end.getX())
                && Math.min(s.start.getY(), s.end.getY()) <= p.getY() && p.getY() <= Math.max(s.start.getY(), s.end.getY());
    }
}
