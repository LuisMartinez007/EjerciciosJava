import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingresa números (ingresa 0 para finalizar):");
        while (true) {
            int numero = in.nextInt();
            if (numero == 0) {
                break;
            }
            contador++;
        }
        in.close();
        System.out.println("Se han ingresado " + contador + " números.");
    }
}
