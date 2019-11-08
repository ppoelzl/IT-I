import java.util.ArrayList;

public class Verantwortlicher extends Person {
    private ArrayList<Projekt> verantwortlich;

    public Verantwortlicher(String name, int personalnummer) {
        super(name, personalnummer);
        this.verantwortlich = new ArrayList<Projekt>();
    }

    @Override
    public void macheVerantwortlichFuer(Projekt p) {
        super.macheVerantwortlichFuer(p);
        this.verantwortlich.add(p);
    }

    public ArrayList<Projekt> getProjekte() {
        return this.verantwortlich;
    }
}
