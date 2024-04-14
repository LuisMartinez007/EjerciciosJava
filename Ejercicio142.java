import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int num = in.nextInt();
        System.out.print("Digite el exponente para el número anterior: ");
        int x=in.nextInt();
        in.close();
        System.out.println(num+"^"+x+" = "+(Math.pow(num, x)));
    }
}
