public class GeschuetzteDatei extends Datei {
    private boolean lesezugriff;
    private boolean schreibzugriff;

    public GeschuetzteDatei(String derText) {
        super(derText);
        this.lesezugriff = false;
        this.schreibzugriff = false;
    }

    public void setLesezugriff() {
        this.lesezugriff = true;
    }

    public void setSchreibzugriff() {
        this.schreibzugriff = true;
    }

    @Override
    public String liesDatei() {
        if (lesezugriff) {
            return super.liesDatei();
        }
        return null;
    }

    @Override
    public boolean schreibeDatei(String text) {
        if (lesezugriff && schreibzugriff) {
            return super.schreibeDatei(text);
        }
        return false;
    }
}
