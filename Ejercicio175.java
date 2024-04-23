import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio175 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaAnterior = fechaActual.minusDays(1);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualFormateada = fechaActual.format(formato);
        String fechaAnteriorFormateada = fechaAnterior.format(formato);
        System.out.println("Fecha actual: " + fechaActualFormateada);
        System.out.println("Fecha del día anterior: " + fechaAnteriorFormateada);
    }
}
