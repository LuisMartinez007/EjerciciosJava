import java.util.Scanner;

public class Ejercicio221 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String CLAVE = "eureka";
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Introduce la clave: ");
            String input = in.nextLine();
            if (input.equals(CLAVE)) {
                System.out.println("¡Clave correcta! ¡Eureka! Has acertado la clave.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Clave incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus 3 intentos. La clave era: " + CLAVE);
                }
            }
        }
        in.close();
    }
}
