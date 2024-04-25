import java.util.Scanner;

public class Ejercicio220 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero,suma = 0,cantidadNumeros = 0;
        do {
            System.out.print("Introduce un número positivo (o -1 para finalizar): ");
            numero = in.nextInt();
            if (numero == -1) {
                break;
            }
            if (numero < 0) {
                System.out.println("No se permiten números negativos. Introduce otro número.");
                numero=0;
            }
            suma += numero;
            cantidadNumeros++;
        } while (numero != -1);
        in.close();
        if (cantidadNumeros == 0) {
            System.out.println("No se introdujeron números para calcular la media.");
        } else {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media aritmética de la secuencia de números ingresados es: " + media);
        }
    }
}
