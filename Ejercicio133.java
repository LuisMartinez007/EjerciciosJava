import java.util.*;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = in.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = in.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es el mayor número.");
            System.out.println(numero2 + " es el menor número.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es el mayor número.");
            System.out.println(numero1 + " es el menor número.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        in.close();
    }
}
