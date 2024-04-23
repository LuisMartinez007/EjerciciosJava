import java.util.*;

public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el nombre completo de la persona: ");
        String nombreCompleto = in.nextLine().toLowerCase();
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int[] contadorVocales = new int[5];
        int totalVocales = 0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                totalVocales++;
                for (int j = 0; j < vocales.length; j++) {
                    if (letra == vocales[j]) {
                        contadorVocales[j]++;
                    }
                }
            }
        }
        System.out.println("Total de vocales en el nombre: " + totalVocales);
        for (int i = 0; i < vocales.length; i++) {
            System.out.println("Cantidad de '" + vocales[i] + "': " + contadorVocales[i]);
        }
        in.close();
    }
}
