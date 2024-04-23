import java.util.*;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el primer número (A): ");
        double numA = in.nextDouble();
        System.out.print("Ingresa el segundo número (B): ");
        double numB = in.nextDouble();
        double suma = numA + numB;
        double resta = numA - numB;
        double multiplicacion = numA * numB;
        double division = numA / numB;
        double residuo = numA % numB;
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);
        in.close();
    }
}
