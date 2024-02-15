import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n1= entrada.nextInt();
        System.out.print("Digite otro numero: ");
        int n2= entrada.nextInt();
        entrada.close();
        int r = n1 % n2;
        System.out.println("Resto: "+ r);
    }
}
