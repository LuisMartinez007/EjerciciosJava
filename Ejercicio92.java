import java.util.Scanner;

public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = in.nextInt();
        int[] vector1 = new int[n];
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = in.nextInt();
        }
        int[] vector2 = new int[n];
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = in.nextInt();
        }
        in.close();
        int productoEscalar = 0;
        for (int i = 0; i < n; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);
    }
}
