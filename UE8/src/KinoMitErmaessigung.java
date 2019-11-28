import java.util.HashMap;
import java.util.Map;

public class KinoMitErmaessigung extends Kino {
    public KinoMitErmaessigung(int n, int m, Map<Integer, Double> diePreise) {
        super(n, m, diePreise);
    }

    public Map<Integer, Double> getErmaessigtePreise(double rabatt) {
        Map<Integer, Double> kino = this.getPreise();
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        for (Integer i : kino.keySet()) {
            map.put(i, kino.get(i) * rabatt / 100.0);
        }
        return map;
    }
}
