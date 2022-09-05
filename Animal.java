public class Animal {

    public String animalName;
    private String color;
    private boolean hasTail;

    public Animal(String animalName, String color) {
        this.animalName = animalName;
        this.color = color;
    }

    public boolean getHasTail() {
        return this.hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getColor() {
        return this.color;
    }

    public void animalGetsTailCut() {
        System.out.println(this.animalName + " gets its tail cut");
        this.hasTail = false;
    }
}
