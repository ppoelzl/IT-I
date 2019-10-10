public class Heizungssteuerung {
    private int min;
    private int max;
    private int temperatur;
    private int schrittweite;

    public Heizungssteuerung(int min, int max) {
        this.min = min;
        this.max = max;
        this.temperatur = this.min;
        this.schrittweite = 5;
    }

    public int getTemperatur() {
        return this.temperatur;
    }

    public void setSchrittweite(int s) {
        if (s > 0) {
            this.schrittweite = s;
        }
    }

    public void waermer() {
        if ((this.temperatur + this.schrittweite) > this.max) {
            this.temperatur = this.max;
        } else {
            this.temperatur += this.schrittweite;
        }
    }

    public void kuehler() {
        if ((this.temperatur - this.schrittweite) < this.min) {
            this.temperatur = this.min;
        } else {
            this.temperatur -= this.schrittweite;
        }
    }
}
