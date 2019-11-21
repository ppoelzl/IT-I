public class Distanz {
    public static Point getClosest(Set<ColoredPoint> diePunkte, ColoredPoint derPunkt, Abstandsfunktion f) {
        ColoredPoint c = null;
        double minDistanz = Double.MAX_VALUE;
        for (ColoredPoint p : diePunkte) {
            if (p.getColor().equals(derPunkt.getColor())) {
                if (f.getAbstand(p, derPunkt) < minDistanz) {
                    c = p;
                    minDistanz = f.getAbstand(p, derPunkt);
                }
            }
        }
        return (Point) c;
    }
}
