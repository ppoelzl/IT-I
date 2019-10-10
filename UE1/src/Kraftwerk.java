class Kraftwerk {
    private double maxLeistung;
    private Stromgenerator generator1;
    private Stromgenerator generator2;

    Kraftwerk(double maxLeistung, double startLeistung) {
        this.maxLeistung = maxLeistung;
        this.generator1 = new Stromgenerator(maxLeistung);
        this.generator2 = new Stromgenerator(maxLeistung);
        setGesamtleistung(startLeistung);
    }

    double getGesamtleistung() {
        return this.generator1.getLeistung() + this.generator2.getLeistung();
    }

    private void setGesamtleistung(double leistung) {
        if (leistung < 0) {
            leistung = 0;
        } else if (leistung > this.maxLeistung) {
            leistung = this.maxLeistung;
        }
        double anteil = leistung / this.maxLeistung;
        this.generator1.setLeistung(anteil / 2);
        this.generator2.setLeistung(anteil / 2);
    }
}
