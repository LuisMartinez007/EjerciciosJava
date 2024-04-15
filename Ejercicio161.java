import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de a: ");
        int a= in.nextInt();
        System.out.print("Digite el valor de b: ");
        int b = in.nextInt();
        in.close();
        System.out.println("Valores originales: \na = "+a+"\nb = "+b);
        int c=a;
        a=b;b=c;
        System.out.println("Valores intercambiados: \na = "+a+"\nb = "+b);
    }
}
