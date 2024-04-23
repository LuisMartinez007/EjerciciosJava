import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el periodo en formato MM AAAA:");
        String periodo = in.nextLine();
        in.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM yyyy");
        LocalDate fecha = LocalDate.parse("01 " + periodo, formatter);
        for (int i = 0; i < 12; i++) {
            fecha = fecha.minusMonths(1);
            String periodoAnterior = fecha.format(formatter);
            System.out.println(periodoAnterior);
        }
    }
}
