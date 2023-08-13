import java.io.Console;
public class Consola {
    public static void main(String[] args)
    {
        Console consola= System.console();

        if( consola == null) //en caso de que system no pueda acceder  a una consoa
        {
            System.err.println("No hay consola"); //imprime un error
            System.exit(1);
        }
        System.out.println("Escribe tu nombre: ");
        String nombre= consola.readLine();
        System.out.println("Hola "+ nombre + "!");
    }
}
