import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de centimetros: ");
        double cm = in.nextDouble();
        double pulgadas = cm*2.54;
        in.close();
        System.out.println(cm+" cm = "+pulgadas+" pulgadas.");
    }
}
