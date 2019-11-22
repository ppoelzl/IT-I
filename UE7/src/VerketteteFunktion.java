public class VerketteteFunktion implements Funktion {
    private Funktion f;
    private Funktion g;

    public VerketteteFunktion(Funktion f, Funktion g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double getWertAnDerStelle(double x) {
        return this.g.getWertAnDerStelle(this.f.getWertAnDerStelle(x));
    }
}
