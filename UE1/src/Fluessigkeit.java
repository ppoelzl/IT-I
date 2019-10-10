class Fluessigkeit {
    private double menge;
    private double temperatur;

    Fluessigkeit(double menge, double temperatur) {
        this.menge = menge;
        this.temperatur = temperatur;
    }

    double getMenge() {
        return this.menge;
    }

    double getTemperatur() {
        return this.temperatur;
    }

    void fuegeHinzu(Fluessigkeit andereFluessigkeit) {
        this.temperatur = (this.temperatur * this.menge
                + andereFluessigkeit.temperatur * andereFluessigkeit.menge)
                / (this.menge + andereFluessigkeit.menge);
        this.menge += andereFluessigkeit.menge;
    }
}
