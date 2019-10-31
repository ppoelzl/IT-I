import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Produkte {
    ArrayList<Produkt> waehleProdukte(ArrayList<Produkt> dieProdukte, int zeit, Anlage a) {
        ArrayList<Produkt> auswahl = new ArrayList<>(0);

        for (Produkt produkt : dieProdukte) {
            if (produkt.hatPrioritaet()) {
                if (a.gibBearbeitungszeit(produkt) <= zeit) {
                    zeit -= a.gibBearbeitungszeit(produkt);
                    auswahl.add(produkt);
                } else {
                    break;
                }
            }
        }

        for (Produkt produkt : dieProdukte) {
            if (!produkt.hatPrioritaet()) {
                if (a.gibBearbeitungszeit(produkt) <= zeit) {
                    zeit -= a.gibBearbeitungszeit(produkt);
                    auswahl.add(produkt);
                } else {
                    break;
                }
            }
        }
        return auswahl;
    }
}
