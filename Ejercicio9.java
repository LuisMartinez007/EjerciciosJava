import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Halla el iva");
        System.out.println("");
        System.out.print("Digite el dinero: $");
        double dinero= entrada.nextDouble();
        entrada.close();
        double iva= (dinero*19)/100;
        System.out.println("Iva de $"+dinero+" = $"+iva);
    }
}
