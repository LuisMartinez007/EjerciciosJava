import java.util.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] notas = new Double[5];
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }
        scanner.close();
        double promedio = (double) suma / 5;
        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("El doble de las notas es:");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]+" = "+notas[i] * 2);
        }
    }
}