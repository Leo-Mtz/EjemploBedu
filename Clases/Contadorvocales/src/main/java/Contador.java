import java.util.Scanner;
public class Contador {

    //args -> argumentos
    public static void main(String[] args) {

        int contador=0;


        //Scanner class -> para que el usuario pueda escribir


        Scanner nombre = new Scanner(System.in);

        System.out.println("Escribe una frase ");
        String text = nombre.nextLine(); // next line se usa para leer los strings


        for (int i = 0; i < text.length(); i++) {
            char caracter = Character.toLowerCase(text.charAt(i));
            // Verificar si el carácter es una vocal (mayúscula o minúscula)
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }


        System.out.println("El numero de vocales es: " +contador);
    }

}

