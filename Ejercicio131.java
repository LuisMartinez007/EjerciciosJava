import java.util.*;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();
        double salarioTotal;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            salarioTotal = (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 2);
        } else {
            salarioTotal = horasTrabajadas * tarifaPorHora;
        }
        System.out.println("El salario total es: $" + (salarioTotal));
        scanner.close();
    }
}
