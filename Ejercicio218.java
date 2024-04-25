import java.util.Scanner;

public class Ejercicio218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce un número positivo y par para N: ");
            N = in.nextInt();
        } while (N <= 0 || N % 2 != 0);
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        in.close();
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}
