import java.util.ArrayList;

public class Firma {
    private ArrayList<Person> dieMitarbeiter;

    public Firma(ArrayList<Person> dieMitarbeiter) {
        this.dieMitarbeiter = dieMitarbeiter;
    }

    public boolean uebernehmeAuftrag(Auftrag a) {
        for (Person mitarbeiter : this.dieMitarbeiter) {
            if (mitarbeiter.kannAuftragUebernehmen(a)) {
                mitarbeiter.bearbeiteAuftrag(a);
                return true;
            }
        }
        return false;
    }
}
