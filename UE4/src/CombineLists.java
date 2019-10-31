import java.util.ArrayList;


public class CombineLists {
    static ArrayList<Integer> combineLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> comb = new ArrayList<>(0);
        int size = Math.max(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            if (i < list1.size()) {
                comb.add(list1.get(i));
            }

            if (i < list2.size()) {
                comb.add(list2.get(i));
            }
        }
        return comb;
    }
}
