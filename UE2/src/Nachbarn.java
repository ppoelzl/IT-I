import java.util.ArrayList;

public class Nachbarn {
    boolean sindNachbarnIn(int a, int b, ArrayList<Integer> liste) {
        for (int i = 0; i < liste.size() - 1; i++) {
            int x = liste.get(i);
            int y = liste.get(i + 1);
            if ((x == a && y == b) || (x == b && y == a)) {
                return true;
            }
        }
        return false;
    }
}
