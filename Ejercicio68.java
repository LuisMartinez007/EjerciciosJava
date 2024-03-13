import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("## SUMA DE FACTORIALES ##");
        System.out.print("Digite un numero: ");
        int n=in.nextInt();
        int suma =0;
        in.close();
        for(int a=1;a<=n;a++){
            suma+=factorial(a);
        }
        System.out.println("La suma de los factoriales desde 1 hasta "+n+" = "+suma);
    }
    public static int factorial(int numero){
        int factorial=1;
        for(int i=1; i<=numero ; i++){
            factorial*=i;
        }
        return factorial;
    }
}
