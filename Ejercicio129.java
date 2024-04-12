import java.util.*;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Ingresa el número de mes (1-12): ");
        int mes = in.nextInt();
        System.out.print("Ingresa el año: ");
        int anio = in.nextInt();
        int dias = diasPorMes[mes-1];
        if (dias != -1) {
            System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");
        } else {
            System.out.println("Mes no válido. Debes ingresar un número de mes entre 1 y 12.");
        }
        in.close();
    }
}
