import java.util.Scanner;

public class Ejercicio238 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, suma = 0;
        System.out.print("Ingrese un número: ");
        numero = in.nextInt();
        int num = numero;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los elementos del número " + numero + " es: " + suma);
        in.close();
    }
}
