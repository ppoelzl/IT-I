import java.util.ArrayList;

public class KameraMitObjekterkennung extends Kamera {
    public ArrayList<Bild> getBilderWie(Bild dasBild) {
        ArrayList<Bild> bilder = new ArrayList<Bild>();
        for (Bild bild : getBilder()) {
            if (Objekterkennung.zeigenDasselbeObjekt(bild, dasBild)) {
                bilder.add(bild);
            }
        }
        return bilder;
    }
}
