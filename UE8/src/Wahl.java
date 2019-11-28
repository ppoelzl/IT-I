import java.util.*;

public class Wahl {
    public static Map<Integer, Person> getMapFromList(List<Person> liste) {
        Map<Integer, Person> set = new HashMap<Integer, Person>();
        for (int i = 0; i < liste.size(); i++) {
            set.put(i, liste.get(i));
        }
        return set;
    }

    public static List<String> getDifferentColors(List<Kugel> dieKugeln) {
        Set<String> set = new HashSet<String>();
        for (Kugel k : dieKugeln) {
            set.add(k.getColor());
        }
        return new ArrayList<String>(set);
    }

    public boolean gibtsPersonenMitMehrAlsEinemAuto(Map<Auto, Person> m) {
        Set<Person> set = new HashSet<Person>(m.values());
        return set.size() < m.size();
    }
}
