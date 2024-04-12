import java.util.*;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el número para encontrar sus múltiplos de 3: ");
        int numero = in.nextInt();
        for (int i = 1; i <= 3000; i++) {
            if (i % numero == 0) {
                System.out.println(i + " es múltiplo de " + numero);
            }
        }
        in.close();
    }
}
