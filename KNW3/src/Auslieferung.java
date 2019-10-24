public class Auslieferung {
    public static void eilBelade(Paket[] diePakete, Lkw derLkw) {
        for (Paket paket : diePakete) {
            if (paket.eilt() && !derLkw.lade(paket)) {
                break;
            }
        }
    }
}
