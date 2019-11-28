import java.util.HashMap;
import java.util.Map;

public class Auftragsverwaltung {
    private Map<Auftrag, Person> map;

    public Auftragsverwaltung() {
        this.map = new HashMap<Auftrag, Person>();
    }

    public boolean addAuftrag(Auftrag einA, Person eineP) {
        if (this.map.containsKey(eineP)) {
            return false;
        }
        this.map.put(einA, eineP);
        return true;
    }

    public void loescheAuftrag(Auftrag einAuftrag) {
        this.map.remove(einAuftrag);
    }

    public Person getBeauftragten(Auftrag einAuftrag) {
        this.map.get(einAuftrag);
    }
}
