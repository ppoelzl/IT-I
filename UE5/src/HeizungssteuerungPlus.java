public class HeizungssteuerungPlus extends Heizungssteuerung {
    private int min;
    private int max;

    public HeizungssteuerungPlus(int min, int max) {
        super(min, max);
    }

    public void aufdrehen() {
        while (getTemperatur() < this.max) {
            waermer();
        }
    }

    public void abdrehen() {
        while (getTemperatur() > this.min) {
            kuehler();
        }
    }
}
