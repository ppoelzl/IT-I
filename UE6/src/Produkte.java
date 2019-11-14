import java.util.HashSet;

public class Produkte<Produkt> {
    HashSet<Produkt> waehleProdukte(HashSet<Produkt> dieProdukte, int zeit, Anlage a) {
        HashSet<Produkt> auswahl = new HashSet<Produkt>();

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
