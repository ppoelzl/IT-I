public class Ampel {
    private Ampellicht rot;
    private Ampellicht gelb;
    private Ampellicht gruen;
    private int phase;

    public Ampel(){
        this.rot = new Ampellicht("rot");
        this.gelb = new Ampellicht("gelb");
        this.gruen = new Ampellicht("gruen");
        this.rot.turn();
        this.phase = 0;
    }

    public String getColor(){
        if(this.rot.isOn()) {
            return this.rot.getColor();
        } else if (this.gelb.isOn()){
            return this.gelb.getColor();
        } else if (this.gruen.isOn()){
            return this.gruen.getColor();
        }
        return null;
    }

    public void nextPhase(){
        if(this.phase == 0 || this.phase == 3){
            this.rot.turn();
            this.phase = 0;
        } else if(this.phase == 1 || this.phase == 2) {
            this.gruen.turn();
        }
        this.gelb.turn();
        this.phase += 1;
    }
}
