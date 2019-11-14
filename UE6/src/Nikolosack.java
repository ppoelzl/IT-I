import java.util.HashSet;

public class Nikolosack {
    private HashSet<Geschenk> set;

    public Nikolosack() {
        this.set = new HashSet<Geschenk>();
    }
    public void add(Geschenk einGeschenk) {
        this.set.add(einGeschenk);
    }
    public HashSet<Geschenk> getAll() {
        return this.set;
    }
    public Geschenk getOne() {
        for (Geschenk g : this.set) {
            this.set.remove(g);
            return g;
        }
    }
}
