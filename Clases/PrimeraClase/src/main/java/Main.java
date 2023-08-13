public class Main {
    public static void main(String[] args){
        Persona p1= new Persona("Leo", 19, "Mexican", "Male");

        System.out.println("Nombre: " +p1.getName());
        p1.setName("Diego");
        System.out.println("Nombre: " +p1.getName());
        System.out.println("Edad: " +p1.getAge()); //it's getting the values from what I previously stated
        p1.setAge(13); //it´s setting a new value
        System.out.println("Edad de diego: "+p1.getAge());
        //it´s getting the new value after i set it


    }
}
