public abstract class Steuerung {
    private int minWert;
    private int maxWert;

    public Steuerung(int minWert, int maxWert) {
        this.minWert = minWert;
        this.maxWert = maxWert;
    }

    public int getMin() {
        return this.minWert;
    }

    public int getMax() {
        return this.maxWert;
    }

    public abstract int getWert();
    public abstract void rauf();
    public abstract void runter();
}
