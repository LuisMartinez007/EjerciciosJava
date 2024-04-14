import java.util.*;

public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el lado 1 de un triangulo: ");
        double lado1 = in.nextDouble();
        System.out.print("Ingrese el lado 2 de un triangulo: ");
        double lado2 = in.nextDouble();
        System.out.print("Ingrese el lado 3 de un triangulo: ");
        double lado3 = in.nextDouble();
        in.close();
        if (esTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Los lados forman un triángulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Los lados forman un triángulo isósceles.");
            } else {
                System.out.println("Los lados forman un triángulo escaleno.");
            }
        } else {
            System.out.println("Los números ingresados no forman un triángulo.");
        }
    }
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
