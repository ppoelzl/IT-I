import java.util.Random;

public class Wuerfel {
    private static Random random = new Random();
    private static int letzterWurf;
    private static int anzahlVersuche;

    static int wuerfelnBisDoppelSechs() {
        while (true) {
            anzahlVersuche++;
            int r = random.nextInt(6) + 1;
            if (r == 6 && letzterWurf == 6) {
                return anzahlVersuche;
            }
            letzterWurf = r;
        }
    }
}
