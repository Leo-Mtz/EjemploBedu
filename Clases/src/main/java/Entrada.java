import java.util.Scanner;

public class Entrada {
    /*los nombres de las clases siempre van en mayuscula
    para Java cualquier cosa es un objeto ppor ende siempre utilizamos clases
               */
//importar clases es como importar librerias en C
    //metodos y atributos van fuera del main

    public static void main(String[] args) //main es un metodo
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String name= scanner.nextLine();

        System.out.println("Hola "+name+ " estas usando scanner");
    }// aqui esta lo que ejecutara el programa
}
