import java.util.*;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la coordenada de inicio del caballo (x y):");
        int xInicio = in.nextInt();
        int yInicio = in.nextInt();
        System.out.println("Ingrese la coordenada destino (x y):");
        int xDestino = in.nextInt();
        int yDestino = in.nextInt();
        int diffX = Math.abs(xDestino - xInicio);
        int diffY = Math.abs(yDestino - yInicio);
        if ((diffX == 1 && diffY == 2) || (diffX == 2 && diffY == 1)) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }
        in.close();
    }
}
