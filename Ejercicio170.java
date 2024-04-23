import java.util.*;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numerador de la primera fracción:");
        int numerador1 = in.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción (debe ser el mismo que el de la segunda fracción):");
        int denominador = in.nextInt();
        in.close();
        System.out.println("Ingrese el numerador de la segunda fracción:");
        int numerador2 = in.nextInt();
        int sumaNumerador = numerador1 + numerador2;
        int restaNumerador = numerador1 - numerador2;
        System.out.println("La suma de las fracciones " + numerador1 + "/" + denominador + " + " + numerador2 + "/" + denominador + " es: " + sumaNumerador + "/" + denominador);
        System.out.println("La resta de las fracciones " + numerador1 + "/" + denominador + " - " + numerador2 + "/" + denominador + " es: " + restaNumerador + "/" + denominador);
    }
}
