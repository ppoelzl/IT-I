import java.util.HashMap;

public class Pruefungssystem {
    private HashMap<Pruefung, Integer> set;

    public Pruefungssystem() {
        this.set = new HashMap<Pruefung, Integer>();
    }

    public void addPruefung(Pruefung diePruefung, int note) {
        this.set.putIfAbsent(diePruefung, note);
    }

    public int getNote(Pruefung diePruefung) {
        return this.set.getOrDefault(diePruefung, -1);
    }

    public boolean korrigiereNote(Pruefung einePruefung, int note) {
        this.set.replace(einePruefung, note);
        return this.set.containsKey(einePruefung);
    }
}
