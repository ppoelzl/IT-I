import java.util.HashMap;

public class Lieferanalyse {
    double getUmsatzanteil(Firma firma, Lieferant lieferant) {
        HashMap hashmap = firma.getLieferanten();
        if (hashmap.containsKey(lieferant)) {
            double sum = 0;
            for (double i : hashmap.values()) {
                sum += i;
            }
            return hashmap.get(lieferant) / sum * 100;
        }
        return 0;
    }
}
