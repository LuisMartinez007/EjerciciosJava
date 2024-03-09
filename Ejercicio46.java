import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite una distancia en millas: ");
        double millas = in.nextDouble();
        in.close();
        double metros = millas *1852;
        System.out.println(millas+ " millas equivalen a: "+metros+" metros.");
    }
}
