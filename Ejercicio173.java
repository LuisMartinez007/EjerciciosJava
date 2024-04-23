import java.util.*;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPagar = 0;
        int cantidadTotal = 0;
        while (true) {
            System.out.println("Introduzca la cantidad vendida (o ingrese 0 para terminar):");
            int cantidad = in.nextInt();
            if (cantidad == 0) {
                break;
            }
            System.out.println("Introduzca el precio:");
            double precio = in.nextDouble();
            totalPagar += cantidad * precio;
            cantidadTotal += cantidad;
        } in.close();
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Cantidad total de productos: " + cantidadTotal);
    }
}
