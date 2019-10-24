class Termin {
    private Zeitpunkt einZeitpunkt;
    private String artDesTermins;

    Termin(Zeitpunkt einZeitpunkt, String artDesTermins) {
        this.einZeitpunkt = einZeitpunkt;
        this.artDesTermins = artDesTermins;
    }

    Termin(int jahr, int monat, int tag, int stunde, int minute, String artDesTermins) {
        this.einZeitpunkt = new Zeitpunkt(jahr, monat, tag, stunde, minute);
        this.artDesTermins = artDesTermins;
    }

    String getTermin() {
        return String.format("%s  %s", this.einZeitpunkt.getZeitpunkt(), artDesTermins);
    }

    public boolean istVor(Termin andrerTermin) {
        return this.einZeitpunkt.istVor(andrerTermin.einZeitpunkt);
    }

    Zeitpunkt getZeitpunkt() {
        return this.einZeitpunkt;
    }

    void setDatum(int jahr, int monat, int tag) {
        this.einZeitpunkt.setDatum(jahr, monat, tag);
    }

    void setZeitpunkt(Zeitpunkt einZeitpunkt) {
        this.einZeitpunkt = einZeitpunkt;
    }

    Termin copy() {
        return new Termin(this.einZeitpunkt, this.artDesTermins);
    }

    Termin copyDeep() {
        return new Termin(this.einZeitpunkt.copy(), this.artDesTermins);
    }
}

