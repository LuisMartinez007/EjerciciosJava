import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("******************************* ");
        System.out.println("Hallar el area de un triangulo: ");
        System.out.println("******************************* ");
        System.out.print("Digite la base de un triangulo: ");
        int b=entrada.nextInt();
        System.out.print("Digite la altura de un triangulo: ");
        int h=entrada.nextInt();
        entrada.close();
        int area = (b*h)/2;
        System.out.println("Area = "+area);
    }
}
