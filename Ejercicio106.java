import java.util.Scanner;

public class Ejercicio106{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite el valor de m: ");
        int m=in.nextInt();
        System.out.print("Digite el valor de n: ");
        int n=in.nextInt();
        in.close();
        int mcd = encontrarMCD(m, n);
        System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);
    }
    public static int encontrarMCD(int m, int n) {
        int r=m%n;
        if (r == 0) {
            return n;
        } else {
            return encontrarMCD(n, r);
        }
    }
}