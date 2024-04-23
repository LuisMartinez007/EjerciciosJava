import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio176 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaSiguiente = fechaActual.plusDays(1);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualFormateada = fechaActual.format(formato);
        String fechaSiguienteFormateada = fechaSiguiente.format(formato);
        System.out.println("Fecha actual: " + fechaActualFormateada);
        System.out.println("Fecha del día siguiente: " + fechaSiguienteFormateada);
    }
}
