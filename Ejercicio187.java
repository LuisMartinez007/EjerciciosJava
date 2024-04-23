import java.util.*;

public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición inicial de la reina (fila y columna, ej. 1 1):");
        int filaReina = sc.nextInt();
        int columnaReina = sc.nextInt();
        System.out.println("Ingrese la posición a la que se moverá la reina (fila y columna, ej. 2 2):");
        int filaMovimiento = sc.nextInt();
        int columnaMovimiento = sc.nextInt();
        if (filaReina == filaMovimiento || columnaReina == columnaMovimiento || Math.abs(filaReina - filaMovimiento) == Math.abs(columnaReina - columnaMovimiento)) {
            System.out.println("El movimiento es válido para la reina.");
        } else {
            System.out.println("El movimiento no es válido para la reina.");
        }
        sc.close();
    }
}
