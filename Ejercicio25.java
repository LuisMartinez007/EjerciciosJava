import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de grados centigrados: ");
        double grados = in.nextDouble();
        in.close();
        double fahrenheit = (grados*9)/5+32;
        System.out.println(grados+" grados = "+fahrenheit+ " fahrenheit");
    }
}
