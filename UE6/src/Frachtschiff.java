public class Frachtschiff extends Schiff {
    private double ladevolumen;

    Frachtschiff(double laenge, double geschwindigk, double ladevolumen) {
        super(laenge, geschwindigk);
        this.ladevolumen = ladevolumen;
    }

    @Override
    String toString() {
        return String.format("%s/Ladevolumen:%s", super.toString(), this.ladevolumen);
    }
}
