import java.util.*;

public class Ejercicio118{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPagar = 0;
        System.out.println("Ingresa los montos de los 10 artículos:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Monto del artículo " + i + ": ");
            double monto = in.nextDouble();
            totalPagar += monto;
        }in.close();
        System.out.println("El monto total a pagar es: " + totalPagar);
    }
}