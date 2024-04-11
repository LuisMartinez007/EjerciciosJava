import java.util.*;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String respuesta = "S";
        System.out.println("Hola usuario!");
        while (respuesta.equalsIgnoreCase("S")) {
            System.out.print("¿Desea que siga imprimiendo el saludo? [S/N]: ");
            respuesta = in.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Hola usuario!");
            }
        }
        in.close();
        System.out.println("Programa finalizado.");
    }
}
