import java.util.Scanner;

public class Ejercicio225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del lado del cuadrado: ");
        int lado = in.nextInt();
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
