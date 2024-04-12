import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,suma=0,i=1;
        do {
            System.out.print("Digite el número #"+i+": ");
            n = in.nextInt();
            suma+=n;
            i++;
        } while (n!=0);
        in.close();
        System.out.println("Suma: "+suma);
    }
}
