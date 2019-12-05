import java.util.TreeSet;

public class KartenspielZuZweit {
    private TreeSet<Spielkarte> hand1;
    private TreeSet<Spielkarte> hand2;
    private boolean ersterSpielt;

    KartenspielZuZweit(TreeSet<Spielkarte> hand1, TreeSet<Spielkarte> hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.ersterSpielt = true;
    }

    boolean stich() {
        TreeSet<Spielkarte> spielerA;
        TreeSet<Spielkarte> spielerB;
        if (this.ersterSpielt) {
            spielerA = this.hand1;
            spielerB = this.hand2;
        } else {
            spielerA = this.hand2;
            spielerB = this.hand1;
        }
        Spielkarte karte1 = spielerA.pollLast();
        Spielkarte karte2 = spielerB.higher(karte1);
        if (karte2 == null) {
            karte2 = spielerB.pollFirst();
        } else {
            spielerB.remove(karte2);
        }
        this.ersterSpielt = !this.ersterSpielt;
        return karte1.compareTo(karte2) > 0;
    }
}
