import java.util.*;

public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = in.nextLine();
        in.close();
        int[] contadorVocales = new int[5]; 
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra== 'A') {
                contadorVocales[0]++;
            } else if (letra == 'e' || letra == 'E') {
                contadorVocales[1]++;
            } else if (letra == 'i' || letra == 'I') {
                contadorVocales[2]++;
            } else if (letra == 'o' || letra == 'O') {
                contadorVocales[3]++;
            } else if (letra == 'u' || letra == 'U') {
                contadorVocales[4]++;
            }
        }
        System.out.println("Cantidad de ocurrencias de vocales:");
        System.out.println("A: " + contadorVocales[0]);
        System.out.println("E: " + contadorVocales[1]);
        System.out.println("I: " + contadorVocales[2]);
        System.out.println("O: " + contadorVocales[3]);
        System.out.println("U: " + contadorVocales[4]);
    }
}
