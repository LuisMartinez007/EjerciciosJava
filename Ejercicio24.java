import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de pulgadas: ");
        double plg = in.nextDouble();
        double cm = plg*2.54;
        System.out.println(plg+" plg son: "+cm+" cm");
    }
}
