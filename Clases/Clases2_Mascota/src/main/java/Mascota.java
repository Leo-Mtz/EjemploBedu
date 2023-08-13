public class Mascota {


    private String nombre;
    private String animal;
    private boolean owner;
    int food;

    public Mascota(String nombre, String animal, boolean owner, int food) {
        this.nombre = nombre;
        this.animal = animal;
        this.owner = owner;
        this.food= food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public void dormir(){
        System.out.println("Zzzz");
    }

    public void comer(){
        System.out.println("Yum yum yum");
    }

    public void homeless(){
        System.out.println("Vamos a cuidarlo");

    }

    public void hambre(){
        System.out.println("Es hora de comer");
    }
}
