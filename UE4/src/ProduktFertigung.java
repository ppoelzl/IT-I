import java.util.ArrayList;

public class ProduktFertigung {
    private String typ;
    private ArrayList<Artikel> dieArtikel;

    public ProduktFertigung(String typ, ArrayList<Artikel> dieArtikel) {
        this.typ = typ;
        this.dieArtikel = dieArtikel;
    }

    public boolean bestelle(ArrayList<Lieferant> dieLieferanten) {
        boolean entered = false;

        for (Lieferant lieferant : dieLieferanten) {
            for (Artikel artikel : this.dieArtikel) {
                if (!lieferant.istLieferbar(artikel)) {
                    entered = true;
                    break;
                }
            }
            if (!entered) {
                return true;
            }
        }
        return false;
    }
}
