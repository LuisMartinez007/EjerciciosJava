import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de A: ");
        int a= in.nextInt();
        System.out.print("Digite el valor de B: ");
        int b= in.nextInt();
        int c =a;
        System.out.println("A = "+a+"  B = "+b);
        a=b;
        b =c;
        System.out.println("");
        System.out.println("Intercambio de variables");
        System.out.println("A = "+a+"  B = "+b);
    }
}