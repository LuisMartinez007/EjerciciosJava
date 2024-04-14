import java.util.*;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu nombre en MAYÚSCULAS: ");
        String nombre = in.nextLine();
        in.close();
        if (nombre.startsWith("A")) {
            nombre = nombre.toLowerCase();
            System.out.println("Nombre convertido a minúsculas: " + nombre);
        } else {
            System.out.println("Nombre no convertido a minúsculas: " + nombre);
        }
    }
}
