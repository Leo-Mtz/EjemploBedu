public class Loops {


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //ARRAY
        short[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j = 0; j < valores.length - 1; j++) {
            System.out.println(valores[j]);
            System.out.println("\n");

        }


        //FOR EACH, lo imprime para cada uno sin tener que hacer un loop extenso
        for (short valor : valores) {
            System.out.println(valor);
            System.out.println("\n");

        }


        //WHILE-> puede no cumplirse

        boolean bandera = false;


        //DO WHILE -> minimo se ejecuta el cuerpo del loop una vez

        do {
            System.out.println("Hey Barbie");

        } while(bandera == true);

        while(bandera==true){
            System.out.println("This is my Mojo Dojo Casa House");
        }
    }
}



