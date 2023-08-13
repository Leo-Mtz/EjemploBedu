public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Max", "Perro, Labrador", true, 0);
        System.out.println("Nombre: " + miMascota.getNombre());
        System.out.println("Animal: " + miMascota.getAnimal());
        System.out.println("Tiene dueño? " + miMascota.isOwner());
        System.out.println("Cuantos kilos de comida ha comido hoy? "+ miMascota.food);

        if (miMascota.isOwner() == true && miMascota.food >0) {
            miMascota.dormir();
            miMascota.comer();


        } else if (miMascota.food==0 ) {
            miMascota.hambre();
            
        } else if (miMascota.isOwner()==false) {
            miMascota.homeless();

        }

    }
}

