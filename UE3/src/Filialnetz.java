public class Filialnetz {
    private ArrayList<Filiale> dieFilialen;

    public Filialnetz(ArrayList<Filiale> dieFilialen) {
        this.dieFilialen = dieFilialen;
    }

    public void restrukturiere() {
        double kleinsterAbstand = Double.MAX_VALUE;
        Filiale zuSchliessen = null;
        for (Filiale filialeX : this.dieFilialen) {
            for (Filiale filialeY : this.dieFilialen) {
                if (filialeX != filialeY) {
                    double abstand = filialeX.getAbstand(filialeY);
                    if (abstand < kleinsterAbstand) {
                        kleinsterAbstand = abstand;
                        zuSchliessen = filialeX;
                    }
                }
            }
        }
        zuSchliessen.schliesse();
        this.dieFilialen.remove(zuSchliessen);
    }
}
