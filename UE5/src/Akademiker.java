public class Akademiker extends Person {
    private String titel;

    Akademiker(String name, String titel) {
        super(name);
        this.titel = titel;
    }

    public void promoviere() {
        this.titel = String.format("%s Dr.", this.titel);
    }

    @Override
    public String getName() {
        return String.format("%s %s", this.titel, super.getName());
    }
}
