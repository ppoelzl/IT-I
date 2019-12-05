import java.util.TreeSet;

public class Terminverwaltung {
    private TreeSet<Termin> termine;

    Terminverwaltung() {
        this.termine = new TreeSet<Termin>();
    }

    void add(Termin einTermin) {
        this.termine.remove(einTermin);
        this.termine.add(einTermin);
    }

    Termin getNaechstenTermin() {
        return this.termine.pollFirst();
    }
}
