import java.util.Arrays;

public class Median {
    int getMittleresElement(int[] a) {
        Arrays.sort(a);
        return a[Math.floorDiv(a.length, 2)];
    }
}
