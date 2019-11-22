public class Heizungssteuerung extends Steuerung {
    private int temperatur;
    private int schrittweite;

    public Heizungssteuerung(int min, int max) {
        super(min, max);
        this.temperatur = min;
        this.schrittweite = 5;
    }

    @Override
    public int getWert() {
        return this.temperatur;
    }

    @Override
    public void rauf() {
        this.temperatur = Math.min(this.temperatur + this.schrittweite, this.getMax());
    }

    @Override
    public void runter() {
        this.temperatur = Math.max(this.temperatur - this.schrittweite, this.getMin());
    }

    public void setSchrittweite(int s) {
        if (s > 0) {
            this.schrittweite = s;
        }
    }
}
