public class Ejemplo2 {
    public static void main( String[] args)
    {
        //creacion de un nuevo automovil
        Automovil auto= new Automovil("Ford", "Shelby", 1965, 25000);
        Automovil auto2= new Automovil("Ferrari", "812", 2021, 120);
        System.out.println(auto.hashCode());
        System.out.println(auto2.hashCode());

        //el hashcode es como un identificador de objetos

        //booleano que compara atributos para ver si se trata del mismo obj o no
        System.out.println(auto.equals(auto2));

        //toda clase tiene hashcode en java

        System.out.println("Ford".hashCode());
        System.out.println("Shelby".hashCode());

    }
}
