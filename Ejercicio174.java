import java.util.*;

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el nombre completo del empleado:");
        String nombreCompleto = in.nextLine().toLowerCase();
        System.out.print("Ingrese el área o departamento del empleado:");
        String areaDepartamento = in.nextLine().toLowerCase();
        in.close();
        String[] nombreSplit = nombreCompleto.split(" ");
        String nombreUsuario = "";
        for (String palabra : nombreSplit) {
            nombreUsuario += palabra.charAt(0);
        }
        nombreUsuario = areaDepartamento.substring(0, 2) + nombreUsuario;
        System.out.println("Nombre de usuario generado: " + nombreUsuario);
    }
}
