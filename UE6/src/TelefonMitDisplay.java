public class TelefonMitDisplay extends Telefon {
    private String display;

    public TelefonMitDisplay(String s) {
        super(s);
    }

    public void setDisplay(String s) {
        this.display = s;
    }

    public void loeschen() {
        this.display = "";
    }

    @Override
    public void anrufen(Telefon anderesTelefon) {
        super.anrufen(anderesTelefon);
        setDisplay(String.format("Anruf an %s", anderesTelefon.gibNummer()));
        if (anderesTelefon instanceof TelefonMitDisplay) {
            TelefonMitDisplay telefonMitDisplay = (TelefonMitDisplay) anderesTelefon;
            telefonMitDisplay.setDisplay(String.format("Anruf von %s", gibNummer()));
        }
    }
}
