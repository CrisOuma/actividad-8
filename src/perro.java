public class perro {
    private String raza;
    private String name;
    private String color;
    private int eyes;
    private int paws;
    private int ears;
    private boolean owner;

    public perro(String raza, String name, String color, int eyes, int paws, int ears, boolean owner){
        this.raza = raza;
        this.name = name;
        this.color = color;
        this.eyes = eyes;
        this.paws = paws;
        this.ears = ears;
        this.owner = owner;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void comer(String Tfood, double grms){
        boolean yummy = false;
    }

    public String ladrar(){
        String woof = "guau guau";
        return woof;
    }

}
