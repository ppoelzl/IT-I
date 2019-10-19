public class Sicherheitstuer {
    private int code;

    Sicherheitstuer(int code) {
        this.code = code;
    }
    public boolean oeffne(int code) {
        return code == this.code;
    }
}
