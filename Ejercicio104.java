import java.util.Scanner;

public class Ejercicio104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        double numero=in.nextInt();
        System.out.print("Digite el indice de la raiz: ");
        double indice=in.nextInt();
        in.close();
        double raiz=Math.pow(numero, 1/indice);
        System.out.println((int)numero+" ^1/"+(int)indice+" = "+raiz);
    }
}
