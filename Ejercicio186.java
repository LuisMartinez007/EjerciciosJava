import java.util.*;

public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = in.nextLine();
        in.close();
        String palabraInversa = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInversa += palabra.charAt(i);
        }
        System.out.println("La palabra en orden inverso es: " + palabraInversa);
    }
}
