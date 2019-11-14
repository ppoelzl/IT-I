import java.util.HashMap;
import java.util.Map;

public class Triple {
    static boolean containsTriple(int[] liste) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < liste.length; i++) {
            int key = liste[i];
            if (countMap.containsKey(key)) {
                int count = countMap.get(key);
                count++;
                countMap.put(key, count);
            } else {
                countMap.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> val : countMap.entrySet()) {
            if (val.getValue() == 3) {
                return true;
            }
        }
        return false;
    }
}
