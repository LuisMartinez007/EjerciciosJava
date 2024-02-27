import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int n=in.nextInt();
        do {
            
            System.out.print(n+ " ");
            n--;
        } while (n>=0);
    }
}
