public class HeizungssteuerungInterface implements SteuerungInterface {
    private int min;
    private int max;
    private int temperatur;
    private int schrittweite;

    public HeizungssteuerungInterface(int min, int max) {
        this.min = min;
        this.max = max;
        this.temperatur = min;
        this.schrittweite = 5;
    }

    @Override
    public int getMin() {
        return this.min;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public int getWert() {
        return this.temperatur;
    }

    public void setSchrittweite(int s) {
        if (s > 0) {
            this.schrittweite = s;
        }
    }

    @Override
    public void rauf() {
        this.temperatur = Math.min(this.temperatur + this.schrittweite, this.getMax());
    }

    @Override
    public void runter() {
        this.temperatur = Math.max(this.temperatur - this.schrittweite, this.getMin());
    }
}
