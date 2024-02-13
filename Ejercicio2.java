import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto= entrada.nextLine();
        entrada.close();
        System.out.println("El texto ingresado es: "+texto);
    }
}
