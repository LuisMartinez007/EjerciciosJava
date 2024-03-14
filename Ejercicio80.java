import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = in.nextInt();
        System.out.print("Ingrese un número real: ");
        double numeroReal = in.nextDouble();
        in.close();
        System.out.println("El número entero ingresado es: " + numeroEntero);
        System.out.println("El número real ingresado es: " + numeroReal);
    }
}
