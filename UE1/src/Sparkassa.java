public class Sparkassa {
    private int betrag;

    public Sparkassa() {
        this.betrag = 0;
    }

    public void einzahlen(int betrag) {
        if (betrag > 0) {
            this.betrag += betrag;
        }
    }

    public int leeren() {
        int endstand = this.betrag;
        this.betrag = 0;
        return endstand;
    }
}
