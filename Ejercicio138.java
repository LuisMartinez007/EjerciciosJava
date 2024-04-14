import java.util.*;

public class Ejercicio138 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de cálculo de áreas:");
            System.out.println("1. Calcular área de un cuadrado");
            System.out.println("2. Calcular área de un círculo");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = in.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = in.nextDouble();
                    double areaCirculo = Math.PI * radio * radio;
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = in.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = in.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
        in.close();
    }
}
