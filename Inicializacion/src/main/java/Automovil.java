public class Automovil {

    private String marca;
    private String modelo;
    private int yearmaking;
    private int kilometraje;

    public Automovil(String marca, String modelo, int yearmaking, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.yearmaking = yearmaking;
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashcode(){
        int hash=0;
        hash=marca.hashCode();

        hash+= modelo.hashCode();

        hash+=yearmaking;
        hash+=kilometraje;

        return hash;


    }
}
