import java.util.HashSet;

public class Bounds {
    public static HashSet<Double> getInterval(double x, HashSet<Double> dieZahlen) {
        HashSet<Double> set = new HashSet<Double>();
        for (double a : dieZahlen) {
            if (a < x) {
                for (double b : dieZahlen) {
                    if (b > x) {
                        set.add(a);
                        set.add(b);
                        break;
                    }
                }
            }
        }
        return set;
    }
}
