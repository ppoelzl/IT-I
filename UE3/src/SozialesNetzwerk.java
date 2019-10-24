public class SozialesNetzwerk {
    private Person[] dieUser;

    public SozialesNetzwerk(Person[] dieUser) {
        this.dieUser = dieUser;
    }

    public void sozialeInteraktion() {
        for (int i = 0; i < this.dieUser.length; i++)
            for (int j = 0; j < this.dieUser.length; j++) {
                if (this.dieUser[i].istBefreundet(this.dieUser[j])) {
                    Posting lastPosting = this.dieUser[j].getLastPosting();
                    this.dieUser[i].findeGut(lastPosting);
                }
            }
    }
}
