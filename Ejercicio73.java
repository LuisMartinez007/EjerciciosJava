import java.util.Scanner;

public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = in.nextDouble();
        in.close();
        double descuento = 0;
        if (sueldo <= 1000) {
            descuento = sueldo * 0.10;
        } else if (sueldo > 1000 && sueldo <= 2000) {
            descuento = 1000 * 0.10 + (sueldo - 1000) * 0.05;
        } else {
            descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldo - 2000) * 0.03;
        }
        double sueldoNeto = sueldo - descuento;
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El sueldo neto que recibe el trabajador es: " + sueldoNeto);
    }
}
