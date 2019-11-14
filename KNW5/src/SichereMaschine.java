public class SichereMaschine extends Maschine {
    public SichereMaschine(String typ) {
        super(typ);
    }

    @Override
    public void schalteEin() {
        if (!istOffen()) {
            super.schalteEin();
        }
    }

    @Override
    public void oeffne() {
        if (!istEingeschaltet()) {
            super.oeffe();
        }
    }
}
