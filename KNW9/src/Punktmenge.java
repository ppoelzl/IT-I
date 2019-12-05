import java.util.TreeSet;

public class Punktmenge {
    private TreeSet<Double> set;

    public Punktmenge(TreeSet<Double> diePunkte) {
        this.set = new TreeSet<>();
    }

    public Intervall getIntervall() {
        return new Intervall(this.set.first(), this.set.last());
    }
}
