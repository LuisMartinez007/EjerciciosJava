import java.util.Scanner;

public class Ejercicio222 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int suma = 0;
        int cantidadNumeros = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Introduce números enteros (0 para terminar):");
        do {
            System.out.print("Introduce un número: ");
            numero = in.nextInt();
            if (numero != 0) {
                suma += numero;
                cantidadNumeros++;
                maximo = Math.max(maximo, numero);
                minimo = Math.min(minimo, numero);
            }
        } while (numero != 0);
        in.close();
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se introdujeron números para calcular las estadísticas.");
        }
    }
}
