import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = in.nextDouble();
        in.close();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        }
    }
}
