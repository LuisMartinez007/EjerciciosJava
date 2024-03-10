import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        double n1 = in.nextDouble();
        System.out.print("Digite otro numero: ");
        double n2 = in.nextDouble();
        System.out.print("Digite otro numero mas: ");
        double n3 = in.nextDouble();
        in.close();
        double suma = n1+n2+n3;
        System.out.println(n1 +" + "+n2+" + "+n3+" = "+suma);
        double multiplicacion = n1*n2*n3;
        System.out.println(n1 +" x "+n2+" x "+n3+" = "+multiplicacion);
    }
}
