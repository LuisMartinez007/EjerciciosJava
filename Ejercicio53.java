import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de un lado de un cuadrado: ");
        double lado = in.nextDouble();
        in.close();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
}
