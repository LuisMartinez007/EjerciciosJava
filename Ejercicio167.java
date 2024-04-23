import java.util.*;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int cantidadNumeros = 0;
        System.out.println("Ingresa una lista de números positivos (para terminar, teclea 0): ");
        int numero = in.nextInt();
        while (numero != 0) {
            if (numero > 0) {
                total += numero;
                cantidadNumeros++;
            } else {
                System.out.println("Por favor, ingresa solo números positivos.");
            }
            numero = in.nextInt();
        }
        if (cantidadNumeros == 0) {
            System.out.println("No se ingresaron números válidos para calcular el promedio.");
        } else {
            double promedio = (double) total / cantidadNumeros;
            System.out.printf("El promedio de los números ingresados es: %.2f\n", promedio);
        }
        in.close();
    }
}
