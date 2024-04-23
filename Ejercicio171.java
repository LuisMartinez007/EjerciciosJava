import java.util.*;

public class Ejercicio171 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Menú de conversión de unidades:");
            System.out.println("1 - Libras a kilogramos");
            System.out.println("2 - Millas a kilómetros");
            System.out.println("3 - Galones a litros");
            System.out.println("4 - Fahrenheit a Celsius");
            System.out.println("5 - Salir");
            System.out.println("Ingrese la opción deseada:");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor en libras:");
                    double libras = in.nextDouble();
                    double kilogramos = libras * 0.453592;
                    System.out.println(libras + " libras equivale a " + kilogramos + " kilogramos.");
                    break;
                case 2:
                    System.out.println("Ingrese el valor en millas:");
                    double millas = in.nextDouble();
                    double kilometros = millas * 1.60934;
                    System.out.println(millas + " millas equivale a " + kilometros + " kilómetros.");
                    break;
                case 3:
                    System.out.println("Ingrese el valor en galones:");
                    double galones = in.nextDouble();
                    double litros = galones * 3.78541;
                    System.out.println(galones + " galones equivale a " + litros + " litros.");
                    break;
                case 4:
                    System.out.println("Ingrese el valor en grados Fahrenheit:");
                    double fahrenheit = in.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + " grados Fahrenheit equivale a " + celsius + " grados Celsius.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
        in.close();
    }
}
