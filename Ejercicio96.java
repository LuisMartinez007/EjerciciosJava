import java.util.Scanner;

public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = in.nextLine();
        in.close();
        String[] palabras = frase.split(" ");
        System.out.println("Palabras y número de letras:");
        for (String palabra : palabras) {
            System.out.print(palabra+": ");
            System.out.println(palabra.length());
        }
    }
}
