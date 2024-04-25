import java.util.Scanner;

public class Ejercicio233 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumeros, numero;
        System.out.print("Ingrese la cantidad de números a convertir: ");
        totalNumeros = in.nextInt();
        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Ingrese un número: ");
            numero = in.nextInt();
            if (numero < 0) {
                numero = Math.abs(numero);
            }
            System.out.println("Número convertido a positivo: " + numero);
        }
        in.close();
    }
}
