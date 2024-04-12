import java.util.*;

public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un año (4 dígitos): ");
        int año = in.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        in.close();
    }
}
