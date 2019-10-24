public class Hausuebung {
    public static Text macheHausuebung(Schueler max, Lehrer laempel) {
        Text text = max.schreibe();
        while (laempel.korrigiere(text) > 0) {
            text = max.schreibeVerbesserung(text);
        }
        return text;
    }
}
