import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = in.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = in.nextDouble();
        in.close();
        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
        double resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);
        double multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación es: " + multiplicacion);
        double division = numero1 / numero2;
        System.out.println("La división es: " + division);
        double resto = numero1 % numero2;
        System.out.println("El resto (módulo) de la división es: " + resto);
    }
}
