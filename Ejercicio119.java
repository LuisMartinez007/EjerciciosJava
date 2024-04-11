import java.util.*;

public class Ejercicio119{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String contraCorrecta = "passwd";
        int intentos = 0;
        while (intentos < 3) {
            System.out.print("Ingresa la contraseña: ");
            String contraIngresada = in.nextLine();
            if (contraIngresada.equals(contraCorrecta)) {
                System.out.println("Contraseña aceptada");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                intentos++;
            }
        } in.close();
        if (intentos == 3) {
            System.out.println("Intentos excedidos");
        }
    }
}