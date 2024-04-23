import java.util.*;

public class Ejercicio177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = in.nextInt();
        in.close();
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
