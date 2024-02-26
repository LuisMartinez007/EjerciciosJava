import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digte un numero real: ");
        double n= in.nextDouble();
        int n_entero = (int) n;
        double n_decimal= n- n_entero;
        System.out.println("Parte entera: "+n_entero);
        System.out.println("Parte decimal: "+n_decimal);
    }
}
