import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un valor en dolares: ");
        int dolares=in.nextInt();
        in.close();
        double bolivianos = dolares*8.08;
        System.out.println(dolares+" dolares equivalen a: $"+bolivianos+" bolivianos");
    }
}
