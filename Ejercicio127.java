import java.util.*;
import java.time.LocalDate;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el día: ");
        int dia = in.nextInt();
        System.out.print("Ingresa el mes: ");
        int mes = in.nextInt();
        System.out.print("Ingresa el año: ");
        int año = in.nextInt();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        String estacion = obtenerEstacion(fecha.getMonthValue());
        System.out.println("La fecha " + dia + "/" + mes + "/" + año + " corresponde a la estación: " + estacion);
        in.close();
    }
    public static String obtenerEstacion(int mes) {
        String estacion;
        switch (mes) {
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            default:
                estacion = "Mes no válido";
                break;
        }
        return estacion;
    }
}
