import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DIgite un numero: ");
        double n1= entrada.nextInt();
        System.out.print("DIgite otro numero: ");
        double n2= entrada.nextInt();
        System.out.print("DIgite otro numero: ");
        double n3= entrada.nextInt();
        entrada.close();
        double media=(n1+n2+n3)/3;
        System.out.println("Media aritmetica = "+media);
        double suma = n1+n2+n3;
        System.out.println("Suma: "+suma);
        System.out.println(n1+" = "+(n1*2) );
        System.out.println(n2+" = "+(n2*3));
        System.out.println(n3+" = "+Math.pow(n3, 2));
    }
}
