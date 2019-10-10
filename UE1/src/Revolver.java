class Revolver {
    private int anzSchuesse;
    private int schuesse;

    Revolver(int anzSchuesse) {
        this.anzSchuesse = anzSchuesse;
        laden();
    }

    boolean gibSchussAb() {
        if (this.schuesse > 0) {
            this.schuesse -= 1;
            return true;
        }
        return false;
    }

    void laden() {
        this.schuesse = this.anzSchuesse;
    }
}
