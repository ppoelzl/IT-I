import java.util.List;

public class ZentralsteuerungInterface {
    private List<Steuerung> dieSt;

    public ZentralsteuerungInterface(List<Steuerung> dieSt) {
        this.dieSt = dieSt;
    }

    public int getWert(int nr) {
        return this.dieSt.get(nr).getWert();
    }

    public void rauf(int nr) {
        this.dieSt.get(nr).rauf();
    }

    public void runter(int nr) {
        this.dieSt.get(nr).runter();
    }
}
