public class Ampellicht {
    private boolean an;
    private String farbe;

    public Ampellicht(String color){
        this.farbe = color;
        this.an = false;
    }

    public void turn(){
        this.an = !this.an;
    }

    public boolean isOn(){
        return this.an;
    }

    public String getColor(){
        return this.farbe;
    }
}
