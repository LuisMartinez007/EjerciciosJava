import java.util.Scanner;

public class Ejercicio206 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el salario anterior del obrero: ");
        double salarioAnterior = in.nextDouble();
        in.close();
        double incremento = 0.25;
        double nuevoSalario = salarioAnterior * (1 + incremento);
        System.out.println("El nuevo salario del obrero con un incremento del 25% es: " + nuevoSalario);
    }
}
