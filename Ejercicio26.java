import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la longitud del primer catete: ");
        double cat1 = in.nextDouble();
        System.out.print("Digite la longitud del segundo catete: ");
        double cat2 = in.nextDouble();
        in.close();
        double hip = Math.pow(cat1,2) + Math.pow(cat2,2);
        System.out.println("Cuadrado de la hipotenusa: "+hip);
    }
}
