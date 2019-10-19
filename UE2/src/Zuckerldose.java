import java.util.ArrayList;

public class Zuckerldose {
    private ArrayList<Zuckerl> dieZuckerl;

    public Zuckerldose(ArrayList<Zuckerl> dieZuckerl) {
        this.dieZuckerl = dieZuckerl;
    }

    public Zuckerl getZuckerl(String farbe, String geschmack) {
        for (Zuckerl zuckerl : this.dieZuckerl) {
            if (zuckerl.getFarbe().equals(farbe) && zuckerl.getGeschmack().equals(geschmack)) {
                this.dieZuckerl.remove(zuckerl);
                return zuckerl;
            }
        }
        return null;
    }
}
