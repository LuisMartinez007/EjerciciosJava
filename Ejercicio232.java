import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumeros, numero,positivos = 0,negativos = 0,neutros = 0;
        System.out.print("Ingrese la cantidad de números a evaluar: ");
        totalNumeros = in.nextInt();
        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Ingrese un número: ");
            numero = in.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números neutros: " + neutros);
        in.close();
    }
}
