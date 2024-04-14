import java.util.*;

public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número límite para la serie Fibonacci: ");
        int limite = in.nextInt();
        in.close();
        System.out.println("Serie Fibonacci hasta el número " + limite + ":");
        int a = 0;
        int b = 1;
        int c;
        while (a <= limite) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
