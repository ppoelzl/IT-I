class Zeitpunkt {
    private int jahr;
    private int monat;
    private int tag;
    private int stunde;
    private int minute;

    Zeitpunkt(int jahr, int monat, int tag, int stunde, int minute) {
        this.jahr = jahr;
        this.monat = monat;
        this.tag = tag;
        this.stunde = stunde;
        this.minute = minute;
    }

    String getZeitpunkt() {
        return String.format("%04d/%02d/%02d %02d:%02d",
                this.jahr, this.monat, this.tag, this.stunde, this.minute);
    }

    boolean istVor(Zeitpunkt andererZeitpunkt) {
        return this.jahr * 366 * 31 * 24 * 60 +
                this.monat * 31 * 24 * 60 +
                this.tag * 24 * 60 +
                this.stunde * 60 +
                this.minute <
                andererZeitpunkt.jahr * 366 * 31 * 24 * 60 +
                        andererZeitpunkt.monat * 31 * 24 * 60 +
                        andererZeitpunkt.tag * 24 * 60 +
                        andererZeitpunkt.stunde * 60 +
                        andererZeitpunkt.minute;
    }

    Zeitpunkt copy() {
        return new Zeitpunkt(this.jahr, this.monat, this.tag, this.stunde, this.minute);
    }

    void setDatum(int jahr, int monat, int tag) {
        this.jahr = jahr;
        this.monat = monat;
        this.tag = tag;
    }
}

