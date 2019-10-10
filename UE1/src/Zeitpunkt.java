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
}
