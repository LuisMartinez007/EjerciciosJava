import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una cantidad de kilometros: ");
        float km = in.nextFloat();
        in.close();
        float m = km*1000;
        System.out.println(km+" km = "+ m+" metros");
    }
}
