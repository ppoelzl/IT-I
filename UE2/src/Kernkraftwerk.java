import java.util.ArrayList;

public class Kernkraftwerk {
    private ArrayList<Reaktor> dieReaktoren;

    public Kernkraftwerk(ArrayList<Reaktor> dieReaktoren) {
        this.dieReaktoren = dieReaktoren;
    }

    public boolean fuehreTestDurch(Test test) {
        boolean bestanden = true;
        for (Reaktor reaktor : this.dieReaktoren) {
            if (!reaktor.fuehreTestDurch(test)) {
                reaktor.abschalten();
                bestanden = false;
            }
        }
        return bestanden;
    }
}
