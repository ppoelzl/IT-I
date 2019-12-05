public class Dominospiel {
    public boolean istKorrekt(ArrayList<Dominostein> dieSteine) {
        Dominostein links = null;
        for (Dominostein rechts : dieSteine) {
            if (links != null) {
                if (rechts.getPunkte().get(0) != links.getPunkte().get()) {
                    return false;
                }
            }
            links = rechts;
        }
        return true;
    }
}
