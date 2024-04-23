import java.util.*;

public class Ejercicio196 {
    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];
        Random random = new Random();
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresos[i][j] = 1000 + random.nextInt(5000); 
            }
        }
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            System.out.println("Ingresos del vendedor " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
                System.out.printf("Producto %d: $%.2f\n", (j + 1), ingresos[i][j]);
            }
            System.out.printf("Total del vendedor %d: $%.2f\n", (i + 1), totalVendedor);
            System.out.printf("Promedio por producto del vendedor %d: $%.2f\n", (i + 1), totalVendedor / 10);
            System.out.println();
        }
        double totalIngresos = 0;
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            totalIngresos += totalVendedor;
        }
        System.out.printf("Promedio de ingresos por vendedor: $%.2f\n", totalIngresos / 18);
        System.out.printf("Ingresos totales: $%.2f\n", totalIngresos);
    }
}
