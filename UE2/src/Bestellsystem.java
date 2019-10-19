import java.util.ArrayList;

public class Bestellsystem {
    private ArrayList<Bestellung> bestellungen;

    public Bestellsystem() {
        this.bestellungen = new ArrayList<Bestellung>();
    }

    public ArrayList<Bestellung> getBestellungen() {
        return this.bestellungen;
    }

    public void add(Bestellung b) {
        for (int i=0; i<this.bestellungen.size(); i++) {
            if (this.bestellungen.get(i).getPriortaet() < b.getPriortaet()) {
                this.bestellungen.add(i, b);
                return;
            }
            this.bestellungen.add(b);
        }
    }

    public void erledigeNaechste() {
        this.bestellungen.remove(0);
    }
}
