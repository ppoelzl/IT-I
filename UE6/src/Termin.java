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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Termin) {
            Termin termin = (Termin) obj;
            return getTermin().equals(termin.getTermin());
        }
    }

    public int hashCode() {
        return getTermin().hashCode();
    }

    String getTermin() {
        return String.format("%s  %s", this.einZeitpunkt.getZeitpunkt(), artDesTermins);
    }

    public boolean istVor(Termin andererTermin) {
        return this.einZeitpunkt.istVor(andererTermin.einZeitpunkt);
    }
}
