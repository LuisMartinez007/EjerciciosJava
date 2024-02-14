import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DIgite un numero: ");
        int n1= entrada.nextInt();
        System.out.print("DIgite otro numero: ");
        int n2= entrada.nextInt();
        System.out.print("DIgite otro numero: ");
        int n3= entrada.nextInt();
        entrada.close();
        double media=(n1+n2+n3)/3;
        System.out.println("Media aritmetica = "+media);
    }
}
