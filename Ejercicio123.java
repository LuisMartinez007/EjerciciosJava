import java.util.*;

public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el capital inicial: ");
        double capitalInicial = in.nextDouble();
        System.out.print("Ingresa la tasa de interés diaria (%): ");
        double tasaInteresDiaria = in.nextDouble() / 100; 
        System.out.print("Ingresa el número de días: ");
        int dias = in.nextInt();
        in.close();
        double capitalFinal = capitalInicial * (1 + tasaInteresDiaria * dias);
        System.out.println("El capital final después de " + dias + " días es: " + capitalFinal);
    }
}
