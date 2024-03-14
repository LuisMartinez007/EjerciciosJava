import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una distancia expresada em metros: ");
        double metros=in.nextDouble();
        in.close();
        double km = metros/1000;
        System.out.println(metros+" mts equivalen a: "+km+" km.");
    }
}
