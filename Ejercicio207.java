import java.util.Scanner;

public class Ejercicio207 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el primer número real: ");
        double numero1 = in.nextDouble();
        System.out.print("Ingresa el segundo número real: ");
        double numero2 = in.nextDouble();
        in.close();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
