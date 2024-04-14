import java.util.*;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = in.nextLine();
        in.close();
        if (esPalindromo(palabra)) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }
    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("\\s+", "");
        int izquierda = 0;
        int derecha = palabra.length() - 1;
        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
