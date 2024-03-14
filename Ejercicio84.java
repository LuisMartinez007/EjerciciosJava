import java.util.Scanner;

public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = in.nextInt();
        in.close();
        System.out.println("La edad ingresada es: " + edad);
    }
}
