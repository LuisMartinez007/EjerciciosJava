import java.util.Scanner;

public class Ejercicio139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite un número: ");
        int n= in.nextInt();
        in.close();
        int fac=1;
        for(int i=2;i<=n;i++){
            fac*=i;
        }
        System.out.println(n+"! ="+fac);
    }
}
