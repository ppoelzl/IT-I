import java.util.HashSet;
import java.util.Set;

public class Produktion {
    public static Set<Produkt> bearbeite(Set<Produkt> dieProdukte, Anlage dieAnlage, Pruefabteilung diePruefabteilung) {
        Set<Produkt> set = new HashSet<Produkt>();
        for (Produkt produkt : dieProdukte) {
            dieAnlage.bearbeite(produkt);
            if (diePruefabteilung.pruefe(produkt)) {
                set.add(produkt);
            }
        }
        return set;
    }
}
