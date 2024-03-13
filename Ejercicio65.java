import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        //Escriba un programa que calcule el valor de: 1+2+3+...+n
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n = in.nextInt();
        in.close();
        int acumulador=0;
        for(int i=1; i<=n;i++){
            acumulador+=i;
        }
        System.out.println("La suma de los números del 1 al " + n + " es: " + acumulador);
    }
}
