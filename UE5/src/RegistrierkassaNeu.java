public class RegistrierkassaNeu extends Registrierkassa {
    private double steuersatz;

    RegistrierkassaNeu(String typ, double steuersatz) {
        super(typ);
        this.steuersatz = steuersatz;
    }

    double getFaelligeUmsatzsteuer() {
        return getTagesumsatz() * this.steuersatz;
    }
}
