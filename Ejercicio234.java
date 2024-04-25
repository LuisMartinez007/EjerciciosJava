import java.util.Scanner;

public class Ejercicio234 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, numeroInvertido = 0, numeroOriginal, resto;
        System.out.print("Ingrese un número: ");
        numero = in.nextInt();
        numeroOriginal = numero;
        while (numero > 0) {
            resto = numero % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numero = numero / 10;
        }
        if (numeroOriginal == numeroInvertido) {
            System.out.println("El número ingresado es capicúa.");
        } else {
            System.out.println("El número ingresado no es capicúa.");
        }
        in.close();
    }
}
