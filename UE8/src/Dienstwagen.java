public class Dienstwagen extends Fahrzeug implements PrivateNutzung {
    private String dienstnehmer;
    private double privat;

    Dienstwagen(int nummer, String dienstnehmer) {
        super(nummer);
        this.dienstnehmer = dienstnehmer;
        this.privat = 0;
    }

    @Override
    public void fahrePrivat(double anzahlKilometer) {
        this.fahre(anzahlKilometer);
        this.privat += anzahlKilometer;
    }

    @Override
    public double getSummePrivatFahren() {
        return this.privat;
    }

    @Override
    String toString() {
        return String.format("%s, %s, %d",
                super.toString(),
                this.dienstnehmer,
                this.getKilometerstand() + this.getKilometerstand());
    }
}
