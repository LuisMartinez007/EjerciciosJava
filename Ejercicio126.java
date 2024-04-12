import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa la fecha en formato AAAA MM DD: ");
        String fechaStr = in.nextLine();
        DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy MM dd");
        DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd MMMM 'de' yyyy");
        LocalDate fecha = LocalDate.parse(fechaStr, formatterInput);
        String fechaTexto = fecha.format(formatterOutput);
        System.out.println("Fecha en texto: " + fechaTexto);
        in.close();
    }
}
