class Termin implements Comparable<Termin>{
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

    Termin(int jahr, int monat, int tag, String text) {
        this.einZeitpunkt = new Zeitpunkt(jahr, monat, tag, 0, 0);
        this.artDesTermins = text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Termin) {
            Termin termin = (Termin) obj;
            return getTermin().equals(termin.getTermin());
        }
    }

    @Override
    String toString() {
        return String.format("%s  %s", this.einZeitpunkt.getZeitpunkt(), this.artDesTermins);
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

    @Override
    public int compareTo(Termin t) {
        if (this.equals(t)) {
            return 0;
        } else if (this.istVor(t)) {
            return 1;
        } else {
            return -1;
        }

    }
}
