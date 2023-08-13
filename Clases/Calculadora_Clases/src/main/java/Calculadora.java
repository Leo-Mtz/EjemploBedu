import java.util.Scanner;

public class Calculadora {

    private int num1;
    private int num2;


    //CONSTRUCTOR
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //GETTER
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void lectura(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num1= scanner.nextInt();
        //modifica el valor de int num1
        setNum1(num1);


        System.out.println("Escribe otro numero: ");
        int num2= scanner.nextInt();
        setNum2(num2);


    }


    public static int sum(int num1, int num2) {

        return num1+num2;

    }


    public static int resta(int num1, int num2) {


        return num1 - num2;


    }


    public static int multi(int num1, int num2) {


        return num1 * num2;


    }


    public static int div(int num1, int num2) {


        return num1 / num2;


    }


}





