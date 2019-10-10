class Stromgenerator {
    private double maxLeistung;
    private double leistung;

    Stromgenerator(double maxLeistung) {
        this.maxLeistung = maxLeistung;
        this.leistung = 0;
    }

    double getLeistung() {
        return this.leistung;
    }

    void setLeistung(double anteil) {
        this.leistung = this.maxLeistung * anteil;
    }
}
