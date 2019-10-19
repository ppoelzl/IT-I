public class Einbrechen {
    public Einbrechen() {}

    public static int oeffneTuer(Sicherheitstuer dieTuer) { ;
        for (int i=0; i<9999; i++) {
            if (dieTuer.oeffne(i)) {
                return i;
            }
        }
        return -1;
    }
}
