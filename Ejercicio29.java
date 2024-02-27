import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero real: ");
        double n = in.nextDouble();
        in.close();
        double nCubo= Math.pow(n,3);
        System.out.println("Cubo de "+n+" = "+nCubo);
    }
}
