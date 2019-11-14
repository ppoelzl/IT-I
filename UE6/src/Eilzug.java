import java.util.ArrayList;

public class Eilzug extends Zug {
    public Eilzug(String nummer, Bahnhof start, Bahnhof ziel) {
        super(nummer, start, ziel);
    }

    @Override
    public ArrayList<Bahnhof> gibStrecke() {
        ArrayList<Bahnhof> hauptbahnhoefe = new ArrayList<Bahnhof>();

        for (Bahnhof bahnhof : super.gibStrecke()) {
            if (bahnhof instanceof Hauptbahnhof) {
                hauptbahnhoefe.add(bahnhof);
            }
        }
        return hauptbahnhoefe;
    }
}
