import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("HALLAR AREA DE UN TRIANGULO");
        System.out.println("***************************");
        System.out.print("Digite la base de un triangulo: ");
        int b=entrada.nextInt();
        System.out.print("Digite la altura de un triangulo: ");
        int h=entrada.nextInt();
        entrada.close();
        int area = (b*h)/2;
        System.out.println("Area = "+area);
    }
}
