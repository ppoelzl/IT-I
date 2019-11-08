public class SchrankenanlageMitKapa extends Schrankenanlage {
    private int kapa;
    private int belegung;

    public SchrankenanlageMitKapa(String typ, int kapa) {
        super(typ);
        this.kapa = kapa;
        this.belegung = 0;
    }

    @Override
    public Parkkarte fuerEinfahrtOeffnen() {
        if (this.belegung < this.kapa) {
            this.belegung += 1;
            return super.fuerEinfahrtOeffnen();
        }
        return null;
    }

    public int gibFreiePlaetze() {
        return this.kapa - this.belegung;
    }
}
