import java.util.*;

public class Ejercicio140 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("Menú:");
                System.out.println("1) Salir");
                System.out.println("2) Sumatoria");
                System.out.println("3) Factorial");
                System.out.print("Ingrese una opción: ");
                opcion = in.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Saliendo del programa...");
                        break;
                    case 2:
                        System.out.print("Ingrese un número para calcular la sumatoria: ");
                        int numSuma = in.nextInt();
                        int sum = 0;
                        for (int i = 1; i <= numSuma; i++) {
                            sum += i;
                        }
                        System.out.println("La sumatoria de " + numSuma + " es: " + sum);
                        break;
                    case 3:
                        System.out.print("Ingrese un número para calcular el factorial: ");
                        int numFac = in.nextInt();
                        int fac = 1;
                        for (int i = 1; i <= numFac; i++) {
                            fac *= i;
                        }
                        System.out.println("El factorial de " + numFac + " es: " + fac);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 1);
            in.close();
        }
    
}
