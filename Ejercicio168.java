import java.util.*;

public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa las 5 letras vocales en desorden:");
        String input = in.nextLine();
        if (input.length() != 5) {
            System.out.println("Debes ingresar exactamente 5 letras.");
        } else {
            char[] vocales = input.toCharArray();
            Arrays.sort(vocales);
            System.out.print("Las vocales ordenadas son: ");
            for (char vocal : vocales) {
                System.out.print(vocal + " ");
            }
        }
        in.close();
    }
}
