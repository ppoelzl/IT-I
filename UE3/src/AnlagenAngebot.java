public class AnlagenAngebot {
    private Anlage[] anlagenliste;

    AnlagenAngebot(Anlage[] anlagenliste) {
        this.anlagenliste = anlagenliste;
    }

    Anlage getBilligsteMitMinKapa(int minKapa) {
        boolean nichtNull = false;
        int index = 0;
        for (int i = 0; i < this.anlagenliste.length; i++) {
            if (this.anlagenliste[i].getKapa() >= minKapa) {
                nichtNull = true;
                if (this.anlagenliste[i].getPreis() < this.anlagenliste[index].getPreis()) {
                    index = i;
                } else if (this.anlagenliste[i].getPreis() == this.anlagenliste[index].getPreis()) {
                    if (this.anlagenliste[i].getKapa() > this.anlagenliste[index].getKapa()) {
                        index = i;
                    }
                }
            }
        }
        if (nichtNull) {
            return this.anlagenliste[index];
        }
        return null;
    }
}
