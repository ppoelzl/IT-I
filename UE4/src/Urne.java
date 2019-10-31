import java.util.ArrayList;
import java.util.Random;

public class Urne {
    private static Random random = new Random();
    private ArrayList<String> a;

    Urne(int anzahlRot, int anzahlBlau) {
        this.a = new ArrayList<>(anzahlRot + anzahlBlau);
        for (int i = 0; i < anzahlRot; i++) {
            this.a.add(i, "rot");
        }

        for (int i = anzahlRot; i < anzahlRot + anzahlBlau; i++) {
            this.a.add(i, "blau");
        }
    }

    String nextBall() {
        if (this.a.size() > 0) {
            int r = random.nextInt(this.a.size());
            String s = this.a.get(r);
            this.a.remove(r);
            return s;
        }
        return null;
    }
}