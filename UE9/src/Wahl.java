import java.util.TreeSet;

public class Wahl {
    public static int getMaxLengthAscSeq(int[] liste) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        int counter = 1;
        for (int i = 0; i < liste.length - 1; i++) {
            if (liste[i] < liste[i + 1]) {
                counter++;
            } else {
                set.add(counter);
                counter = 1;
            }
        }
        return set.last();
    }
}
