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
}
