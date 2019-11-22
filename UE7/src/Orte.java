import java.util.HashSet;
import java.util.Set;

public class Orte {
    public static Set<Ort> getOrteErreichbarVon(Ort einOrt, Set<Ort> dieOrte) {
        Set<Ort> set = new HashSetSet<Ort>();
        set.add(einOrt);
        int size;
        do {
            size = set.size();
            for (Ort ort1 : set) {
                for (Ort ort2: dieOrte) {
                    if (ort2.istErreichbarVon(ort1)) {
                        set.add(ort2);
                    }
                }
            }
        } while (set.size() > size);
        set.remove(einOrt);
        return set;
    }
}
