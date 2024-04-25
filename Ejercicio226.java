import java.util.Scanner;

public class Ejercicio226 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite la altura: ");
        int altura=in.nextInt();
        in.close();
        for(int i=altura;i>=1;i--){
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
