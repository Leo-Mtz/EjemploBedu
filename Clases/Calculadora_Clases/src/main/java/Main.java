import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("1.-Calculadora\n");
        System.out.println("2.-Resta\n");
        System.out.println("3.-Multiplicacion\n");
        System.out.println("4.-Division\n");


        Scanner op= new Scanner(System.in);
        System.out.println("Que operacion quieres realizar ? ");
        int opcion= op.nextInt();


        Calculadora miCalculadora= new Calculadora(0,0);
        miCalculadora.lectura();
        int num1= miCalculadora.getNum1();
        int num2= miCalculadora.getNum2();

        switch(opcion) {
            case 1:

                int sum= Calculadora.sum(num1,num2);
                System.out.println(sum);
                break;

            case 2:

                int resta= Calculadora.resta(num1,num2);
                System.out.println(resta);
                break;
            case 3:

                int multi= Calculadora.multi(num1,num2);
                System.out.println(multi);
                break;
            case 4:

                int division=Calculadora.div(num1,num2);
                System.out.println(division);

                break;

            default:
                System.out.println("Escoja una opcion valida");


        }
    }
}


