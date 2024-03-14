import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el número hasta el cual desea generar la serie de Fibonacci: ");
        int limite = in.nextInt();
        int a = 0, b = 1;
        in.close();
        System.out.print("Serie de Fibonacci hasta " + limite + ": "  + b + " ");
        int c = a + b;
        while (c <= limite) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
