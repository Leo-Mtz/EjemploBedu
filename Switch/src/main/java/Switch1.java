public class Switch1 {

    public static void main(String[] args) {

        boolean b = true;


        /* condicional IF */
        if (b) {
            System.out.println("B es verdadero");
        } else {
            System.out.println("B es falsa");
        }

        /* switch de calificaciones */
        String mensaje;
        byte calificacion = 10;

        switch (calificacion) {
            case 10:
                mensaje = "Excelente";
                break;

            case 9:
                mensaje = "Todo bien !";
                break;

            case 8:
                mensaje = "Bien !";
                break;
            case 7:
                mensaje = "Nada mal, pasaste";
                break;

            default:
                mensaje = "Better luck next time :)";

                //no se necesita un breaj ya que ahí termina el switch
        }

        System.out.println(mensaje);


        String[] rainbow = {"red", "orange", "blue", "yellow", "green", "violet", "pink"};

        for (String color : rainbow) {
            System.out.println(color);

        }

    }
}

    //fin switch 1


