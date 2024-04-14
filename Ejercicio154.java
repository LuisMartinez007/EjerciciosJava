import java.util.*;

public class Ejercicio154 {
    public static void main(String[] args) {
        String frase = "Hola que tal";
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombreUsuario = in.nextLine();
        in.close();
        String mensajeCompleto = frase + " " + nombreUsuario;
        System.out.println("Hola que tal, " + nombreUsuario);
        System.out.println("Mensaje completo: " + mensajeCompleto);
    }
}
