import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("### Factorial de un numero ###");
        System.out.print("Digite un numero: ");
        int n= in.nextInt();
        in.close();
        int factorial=1;
        for(int i=1; i<=n ; i++){
            factorial*=i;
        }
        System.out.println(n+"! = "+factorial);
    }
}
