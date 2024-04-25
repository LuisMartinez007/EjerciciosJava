import java.util.Scanner;

public class Ejercicio235 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, a = 0, b = 1, c;
        System.out.print("Ingrese la cantidad de números de la serie Fibonacci a mostrar: ");
        n = in.nextInt();
        System.out.print("Serie Fibonacci de " + n + " números: ");
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                c = i;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(c + " ");
        }
        in.close();
    }
}
